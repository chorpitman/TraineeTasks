package horstman.threadPool;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * @author Cay Horstmann
 * @version 1.01 2012-01-26
 */

public class ThreadPoolTest {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter base directory (e.g. /usr/local/jdk5.0/src): ");
        String directory = "D:\\1FOLDER MAIN";//scanner.nextLine();
//      System.out.print("Enter keyword (e.g. volatile): ");
        String keyword = ".";//scanner.nextLine();

        ExecutorService pool = Executors.newCachedThreadPool();

        MCounter counter = new MCounter(new File(directory), keyword, pool);
        Future<Integer> result = pool.submit(counter);

        try {
            System.out.println(result.get() + " matching files.(найдено совпадений)");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
        }
        pool.shutdown();

        int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
        System.out.println("[Largest pool size=" + largestPoolSize+ "]");
    }
}

/**
 * This task counts the files in a directory and its subdirectories that contain a given keyword.
 */
class MCounter implements Callable<Integer> {
    private File directory;
    private String keyword;
    private ExecutorService pool;
    private int count;

    /**
     * Constructs a MCounter.
     *
     * @param directory the directory in which to start the search
     * @param keyword   the keyword to look for
     * @param pool      the thread pool for submitting subtasks
     */
    public MCounter(File directory, String keyword, ExecutorService pool) {
        this.directory = directory;
        this.keyword = keyword;
        this.pool = pool;
    }

    public Integer call() {
        count = 0;
        try {
            File[] files = directory.listFiles();
            List<Future<Integer>> results = new ArrayList<>();

            for (File itemFile : files)
                if (itemFile.isDirectory()) {
                    MCounter counter = new MCounter(itemFile, keyword, pool);
                    Future<Integer> result = pool.submit(counter);
                    results.add(result);
                } else {
                    if (search(itemFile)) count++;
                }

            for (Future<Integer> result : results)
                try {
                    count += result.get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
        } catch (InterruptedException e) {
        }
        return count;
    }

    /**
     * Searches a file for a given keyword.
     *
     * @param file the file to search
     * @return true if the keyword is contained in the file
     */
    public boolean search(File file) {
        try {
            try (Scanner in = new Scanner(file)) {
                boolean found = false;
                while (!found && in.hasNextLine()) {
                    String line = in.nextLine();
                    if (line.contains(keyword)) found = true;
                }
                return found;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
