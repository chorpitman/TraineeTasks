package com.epam.homeworks.hw3_strings;

public class Test {


    public static void main(String[] args) {
        // Иициализация текста
        String text = "I read the letter. Stood up. Sat down. Pondered for a minute. Then reread the letter again.";
        // Вывод текста
        System.out.println(text);

        String[] strArr = text.split(" ");//разбиваем текст на массив слов
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {

            char first = strArr[i].charAt(0); // первая буква каждого слова

            if (!((strArr[i].length() % 5 == 0) && ((first != 'a') && (first != 'e') && (first != 'i') && (first != 'o') && (first != 'u') && (first != 'y')))) {

                sb.append(strArr[i]).append(" ");
            }

        }
        String outText = sb.toString().trim();

        // вывод результата
        System.out.print(outText + " " + "\n\n");


    }
}


