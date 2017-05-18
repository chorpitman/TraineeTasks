package com.epam.homeworks.kramskoy_tasks.recursion;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Recursion_v2 {
    public static void main(String[] args) {
        File file = new File("/Users/Oleg/Downloads/DOWNLOADS/tmp");
        sourse(file);

        for (Map.Entry<File, Integer> item : map.entrySet()) {
            System.out.println("folder " + item.getKey().getAbsolutePath() + " = " + item.getValue());
        }
    }

    private static Map<File, Integer> map = new HashMap<>();

    public static void sourse(File file) {
        int count = 0;
        File[] files = file.listFiles();
        if (files == null) {
            throw new IllegalArgumentException("Wrong path " + file.getAbsolutePath());
        }

        map.put(file, count);
        for (File currentFile : files) {
            if (currentFile.isDirectory()) {
                sourse(currentFile);
            } else {
                count++;
            }
        }
        if (count > 0) {
            map.put(file, count);
        }
    }
}
