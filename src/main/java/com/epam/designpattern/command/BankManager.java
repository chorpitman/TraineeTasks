package com.epam.designpattern.command;

import java.util.Deque;
import java.util.LinkedList;

public class BankManager {
    private Deque<Operation> operations = new LinkedList<>();
    public void add(Operation operation) {
        operation.commit();
        operations.add(operation);
    }

    public void remove() {
        operations.removeLast().rollaBack();
    }
}
