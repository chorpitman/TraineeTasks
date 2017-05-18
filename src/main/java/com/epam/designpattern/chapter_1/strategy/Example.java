package com.epam.designpattern.chapter_1.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class Example {

    public static final Example FIRST = new Example("first", "first");
    public static final Example SECOND = new Example("second", "second");

    private String a;
    private String b;

    public Example(String a, String b) {
        this.a = a;
        this.b = b;
    }
}
