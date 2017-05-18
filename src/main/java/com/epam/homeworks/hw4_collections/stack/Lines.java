package com.epam.homeworks.hw4_collections.stack;

public class Lines {
    private String sentence;

    public Lines(String sentence) {
        this.sentence = sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {

        return sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
