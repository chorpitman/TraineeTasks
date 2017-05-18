package com.epam.podgotovka.multy.Executor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;

public class ExecutorServiceSample {

    public static void main(String[] args) {

        try {
            List<List<Integer>> integerArrays = loadDataFromFile();

//            List<Integer> sumOfEachArray = calculateSequentially(integerArrays);
//            System.out.println("Sequential Sum");
//            printSumArray(sumOfEachArray);

            ConcurrentHashMap<String, Integer> sumMap = calculateUsingThreads(integerArrays);
            System.out.println("Multi-Threaded sum");
            printSumMap(sumMap);

            sumMap = calculateUsingExecutor(integerArrays);
            System.out.println("Executor Sum");
            printSumMap(sumMap);

//            sumOfEachArray = calculateSumUsingCallable(integerArrays);
//            System.out.println("Callable Sum");
//            printSumArray(sumOfEachArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> calculateSequentially(List<List<Integer>> integerArrays) {
        List<Integer> sumOfEachArray = new ArrayList<>();
        for ( List<Integer> integers : integerArrays){
            int sum = 0;
            for(Integer i : integers){
                sum+=i;
            }
            sumOfEachArray.add(sum);
        }
        return sumOfEachArray;
    }

    private static ConcurrentHashMap<String, Integer> calculateUsingThreads(
            List<List<Integer>> integerArrays){

        ConcurrentHashMap<String, Integer> sumMap =
                new ConcurrentHashMap<>(integerArrays.size());

        List<Thread> threads = new ArrayList<>();
        int i = 1;

        //Create thread instances for each array
        for ( List<Integer> integers : integerArrays){

            String arrayName = "Array "+i;

            Thread thread = new Thread(
                    new ArraySumCalculator(sumMap,integers,arrayName));
            threads.add(thread);
            i++;
        }

        //Now launch all the threads_v1 at the same time
        for ( Thread thread : threads){
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return sumMap;
    }

    private static ConcurrentHashMap<String, Integer> calculateUsingExecutor(
            List<List<Integer>> integerArrays){

        ConcurrentHashMap<String, Integer> sumMap = new
                ConcurrentHashMap<>(integerArrays.size());

        //Number of threads_v1 = 1 more than number of processors.
        ExecutorService executor = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()+1);
        int i = 1;
        for(List<Integer> integers : integerArrays){
            String arrayName = "Array "+i;
            executor.execute(
                    new ArraySumCalculator(sumMap,integers, arrayName));
            i++;
        }
        executor.shutdown();

        try {
            executor.awaitTermination(60,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return sumMap;
    }

    public static List<Integer> calculateSumUsingCallable(
            List<List<Integer>> integerArrays){

        List<Callable<Integer>> callables = new ArrayList<>(integerArrays.size());

        List<Integer> arraySum = new ArrayList<>(integerArrays.size());

        //Create callables for each array
        for ( List<Integer> integers : integerArrays){
            Callable<Integer> callable = new ArraySumCallable(integers);
            callables.add(callable);
        }

        //get fixed thread pool executor
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors() + 1);


        try {

            //Submit all the callables and obtain their Futures
            List<Future<Integer>> futures =
                    executorService.invokeAll(callables);

            executorService.shutdown();

            //Iterate through the futures and get the sum
            for ( Future<Integer> future : futures){
                Integer sum = future.get();

                arraySum.add(sum);


            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println("Exception while calculating sum");
        }

        return arraySum;

    }

    private static List<List<Integer>> loadDataFromFile()
            throws IOException {
        Path path = Paths.get("D:\\1FOLDER MAIN\\2folder\\1.txt");
        List<String> linesInFile = Files.readAllLines(path, Charset.defaultCharset());
        List<List<Integer>> arrays = new ArrayList<>();
        for ( String s : linesInFile){
            String [] sArray = s.split(",");
            List<Integer> integers = new ArrayList<>();
            for ( String sInt : sArray){

                integers.add(Integer.parseInt(sInt));

            }
            arrays.add(integers);
        }

        return arrays;
    }

    private static void printSumArray(List<Integer> sumOfEachArray){
        int i = 1;
        for ( Integer sum : sumOfEachArray){
            System.out.println("Array "+i+":"+sum);
            i++;
        }
    }

    private static void printSumMap(ConcurrentHashMap<String, Integer> sumMap){
        List<String> mapKeys = Collections.list(sumMap.keys());
        Collections.sort(mapKeys, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] o1Array = o1.split(" ");
                String[] o2Array = o2.split(" ");
                Integer o1Int = Integer.parseInt(o1Array[1]);
                Integer o2Int = Integer.parseInt(o2Array[1]);
                return o1Int.compareTo(o2Int);
            }
        });
        for ( String s : mapKeys){
            System.out.println(s+":" + sumMap.get(s));
        }
    }


}

class ArraySumCalculator implements Runnable{

    ConcurrentHashMap<String, Integer> sumMap;
    List<Integer> integers;
    String arrayName;

    ArraySumCalculator(ConcurrentHashMap<String, Integer> sumMap,
                       List<Integer> integers,
                       String arrayName){
        this.sumMap = sumMap;
        this.integers = integers;
        this.arrayName = arrayName;
    }

    @Override
    public void run() {
        int sum = 0;
        for ( Integer i : integers){
            sum += i;
        }
        sumMap.put(arrayName, sum);
    }
}

class ArraySumCallable implements Callable<Integer>{

    List<Integer> integers;

    ArraySumCallable(List<Integer> integers){

        this.integers = integers;
    }

    @Override
    public Integer call() throws Exception {

        Integer sum = 0;

        for (Integer i : integers){
            sum += i;
        }

        return sum;

    }
}