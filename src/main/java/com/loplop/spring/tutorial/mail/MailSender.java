package com.loplop.spring.tutorial.mail;

import javax.mail.MessagingException;

/**
 * Created by i.lopushen on 22/06/2016.
 */
public interface MailSender {

    void send(String to , String subject, String body) throws MessagingException;
}
