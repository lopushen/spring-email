package com.loplop.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by i.lopushen on 22/06/2016.
 */

public class SmtpMailSender implements MailSender {

    private JavaMailSender javaMailSender;

    private Log log = LogFactory.getLog(SmtpMailSender.class);
    @Override
    public void send(String to, String subject, String body) throws MessagingException {
        log.info("Sending SMTP mail to " + to);
        log.info("Sending mail SMTP with subject " + subject);
        log.info("Sending mail SMTP with body " + body);
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        mimeMessageHelper = new MimeMessageHelper(message, true);

        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setText(body, true);

        javaMailSender.send(message);
    }


    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
}
