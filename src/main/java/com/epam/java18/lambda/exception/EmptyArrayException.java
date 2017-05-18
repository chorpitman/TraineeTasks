package com.epam.java18.lambda.exception;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Пустой массив");
    }
}
