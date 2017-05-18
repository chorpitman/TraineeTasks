package com.epam.designpattern.command;

public interface Operation {
    void commit();
    void rollaBack();
}
