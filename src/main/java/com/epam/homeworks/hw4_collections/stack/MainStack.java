package com.epam.homeworks.hw4_collections.stack;

import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) throws IOException {

        Lines lines = new Lines("1");
        Lines lines1 = new Lines("2. Stood up.");
        Lines lines2 = new Lines("3. Sat Down.");
        Lines lines3 = new Lines("4. Pondered for a minute.");

        Stack<Lines> stack = new Stack<Lines>();
        stack.push(lines);
        stack.push(lines1);
        stack.push(lines2);
        stack.push(lines3);

        Iterator<Lines> iter = stack.iterator();
        while (iter.hasNext()) {
            System.out.println(stack.pop().getSentence());
        }
    }
}
