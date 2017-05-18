package com.epam.designpattern.chapter_1.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class SuccessMailTemplate implements Template {

    public String getTemplate(){
        return "all's fine";
    }
}
