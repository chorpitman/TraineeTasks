package com.epam.homeworks.hw3_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T {
    //    private static final Govno REGULAR_EXPRESSION = "(\\b[^Counter1,a,E,e,I,i,O,o,U,u]|\\s{1,})\\w{5}\\b";
    private static final String REGULAR_EXPRESSION = "\\b\\w{5}\\b";
    private static final String INPUT = "I read the letter. Stood up. Sat down. Pondered for a minute. Then reread the letter again.";
    private static final String REPLACE = "";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGULAR_EXPRESSION);
        Matcher m = p.matcher(INPUT);
        String res = m.replaceAll(REPLACE);
        System.out.println(res);
    }
}
