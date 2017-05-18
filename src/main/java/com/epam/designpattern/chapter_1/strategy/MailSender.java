package com.epam.designpattern.chapter_1.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan_Zhuravel
 */
public class MailSender {

    private Map<String, Template> templateMap = new HashMap<String, Template>();


    public MailSender(Map<String, Template> templateMap) {
        this.templateMap = templateMap;
    }

    public void sendMail(String templateName) {
        Template template = templateMap.get(templateName);
        if (template != null) {
            System.out.println(template.getTemplate());
        }
    }
}
