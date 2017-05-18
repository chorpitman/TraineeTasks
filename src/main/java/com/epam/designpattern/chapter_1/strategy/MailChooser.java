package com.epam.designpattern.chapter_1.strategy;

/**
 * @author Ivan_Zhuravel
 */
public enum MailChooser {
    SUCCESS("success", new SuccessMailTemplate()),

    ERROR("error", new ErrorMailTemplate());

    private String templateName;
    private Template templateImpl;

    MailChooser(String templateName, Template templateImpl) {
        this.templateName = templateName;
        this.templateImpl = templateImpl;
    }

    public static void sendMail(String templateName) {
        for (MailChooser mailChooser : values()) {
            if (mailChooser.templateName.equals(templateName)){
                System.out.println(mailChooser.templateImpl.getTemplate());
            }
        }
    }
}
