package com.epam.homeworks.kramskoy_tasks.multythreading.threads_v2;

class Main_v2 {

    public static void main(String[] args) {
        String path = "D:\\DOWNLOADS\\JAVAFOLDERTEST";
        String keyWord = "her";

        long start = System.currentTimeMillis();

        FileTaskManager_v2 fileTasks = new FileTaskManager_v2(path, keyWord);
        int result = fileTasks.getCount();

        System.out.println("[Total result] = " + result);
        System.out.println("[Total time] = " + (System.currentTimeMillis() - start) + " ms");
    }
}
