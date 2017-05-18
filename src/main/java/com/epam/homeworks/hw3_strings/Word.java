package com.epam.homeworks.hw3_strings;

public class Word {
    public static void main(String[] args) {

        String text = "I read the letter. Stood up. Sat down.";
        String[] arrayForSplit = text.split("[\\s.]"); //массив строк для анализа длины слова \\"[\\s.]"
        int max = 0;
        for (int i = 0; i < arrayForSplit.length; i++) {//находим наибольшее по длине слово
            if (max < arrayForSplit[i].length()) {
                max = arrayForSplit[i].length();
            }
        }
        System.out.println("max simbol " + max);
        //поменять местами первое и послднее слово предоложения
        String temp;
        for (int i = 0; i < arrayForSplit.length; i++) {
            temp = arrayForSplit[i];
            arrayForSplit[i] = arrayForSplit[arrayForSplit.length - 1];
            arrayForSplit[arrayForSplit.length - 1] = temp;
            break;
        }
        //print arrayForSplit
        for (String item : arrayForSplit) {
            System.out.print(item + " ");
        }
    }
}

