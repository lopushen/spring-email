package com.loplop.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by i.lopushen on 22/06/2016.
 */
public class MockMailSender implements MailSender {
    private Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending mail to " + to);
        log.info("Sending mail with subject " + subject);
        log.info("Sending mail with body " + body);
    }
}
