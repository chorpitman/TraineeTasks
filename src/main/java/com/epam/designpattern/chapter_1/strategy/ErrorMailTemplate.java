package com.epam.designpattern.chapter_1.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class ErrorMailTemplate implements Template {

    public String getTemplate(){
        return "system had a problems";
    }
}
