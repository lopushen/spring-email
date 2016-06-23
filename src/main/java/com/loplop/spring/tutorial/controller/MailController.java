package com.loplop.spring.tutorial.controller;

import com.loplop.spring.tutorial.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * Created by i.lopushen on 22/06/2016.
 */
@RestController
public class MailController {


    private MailSender mockMailSender;

    @Autowired
    public MailController(MailSender mailSender) {
        this.mockMailSender = mailSender;
    }

    @RequestMapping("/mail")
    public String sendMail() throws MessagingException {
        mockMailSender.send("lopushen@gmail.com", "ioio", "pdfjdjshf");
        return "mail sent";
    }
}
