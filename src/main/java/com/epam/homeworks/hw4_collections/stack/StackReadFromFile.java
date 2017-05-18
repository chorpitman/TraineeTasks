package com.epam.homeworks.hw4_collections.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Stack;

public class StackReadFromFile {

    public static void main(String[] args) throws URISyntaxException {
        Stack<String> sentences = new Stack<>();
        URL url = StackReadFromFile.class.getClassLoader().getResource("data.txt");
        if (url != null) {
            File file = new File(url.toURI());
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String brText;
                while ((brText = br.readLine()) != null) {
                    sentences.push(brText);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(sentences);
            System.out.println("***********************");
            Iterator<String> iter = sentences.iterator();
            while (iter.hasNext()) {
                System.out.println(sentences.pop());
            }
        }
    }
}
