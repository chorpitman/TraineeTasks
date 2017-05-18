package com.epam.designpattern.chapter_1.strategy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //MailChooser.sendMail("error");

        Map<String, Template> map = new HashMap<String, Template>();

        map.put("error", new ErrorMailTemplate());
        map.put("success", new SuccessMailTemplate());

        MailSender mailSender = new MailSender(map);

        mailSender.sendMail("error");
    }
}
