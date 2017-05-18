package yfain.recursion;

import java.io.File;
import java.util.Arrays;

public class Recurs {
    public static void main(String[] args) {
        //write directory in pathDirectory
        File pathDirectory = new File("D:\\projects\\hw\\src\\main\\java\\com\\epam");
        displayPathThree(pathDirectory);
        System.out.println("___________________________________________");
        isPath(pathDirectory);
    }

    public static void displayPathThree(File path) {
        if (path.isFile()) {
            System.out.println("name " + path.getName());
        } else {
            System.out.println("directory name: " + path.getName());
            System.out.println("**************************");
            File files[] = path.listFiles();
            for (File item : files) {
                displayPathThree(item);
            }
        }
    }
    //test methods of Java Class - FILE
    public static void isPath(File path) {
        System.out.println("listRoots() " + Arrays.asList(path.listRoots()));
        System.out.println("getFreeSpace() " + Arrays.asList(path.getFreeSpace()));
        System.out.println("getParent() " + Arrays.asList(path.getParent()));
        System.out.println("listFiles() " + Arrays.asList(path.listFiles()));
        System.out.println("getTotalSpace() " + Arrays.asList(path.getTotalSpace()));
        System.out.println("path.listFiles() " + Arrays.asList(path.listFiles()));
    }
}
