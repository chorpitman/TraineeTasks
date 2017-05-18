package com.epam.homeworks.hw3_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String sentence = "I read the letter. Stood up. Sat down. Pondered for a minute. Then reread the letter again.";
        //Я прочитал письмо. Встал. Сел. Поразмышлял минуту. Потом еще раз перечитал письмо.
        consonantsWord(sentence);
    }

    // 12.	Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
    public static void consonantsWord(String sentence) {
        Pattern p = Pattern.compile("\"(\\b*[^A,a,E,e,I,i,O,o,U,u]){1}\\w{4,5}\\b\"");
        Matcher m = p.matcher(sentence);
        sentence = m.replaceAll("");
        System.out.println(sentence);
    }

}
