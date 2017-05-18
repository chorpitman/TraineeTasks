package com.epam.homeworks.kramskoy_tasks.recursion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recursion_v3 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        listFilesForFolder(new File("D:\\DOWNLOADS\\JAVAFOLDERTEST"));

        for (Map.Entry<String, ArrayList<String>> foldername : dirFiles.entrySet()) {
            System.out.println(foldername.getKey() + " " + foldername.getValue());
        }
    }

    public static HashMap<String, ArrayList<String>> dirFiles = new HashMap<>();

    public static void listFilesForFolder(File folder) throws IOException {
        if (folder.isDirectory()) {
            ArrayList<String> fileNames = new ArrayList<String>();
            for (final File fileEntry : folder.listFiles()) {
                // System.out.println(fileEntry.toString());
                if (fileEntry.isDirectory()) {
                     System.out.println(fileEntry.toString());
                    listFilesForFolder(fileEntry);
                } else {
                    String fileName = (fileEntry.getPath()).toString();
                    fileNames.add(fileEntry.getPath());
                }
            }
            dirFiles.put(folder.getName(), fileNames);
        }
    }

}