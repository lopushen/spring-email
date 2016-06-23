package com.loplop.spring.tutorial;

import com.loplop.spring.tutorial.controller.MailController;
import com.loplop.spring.tutorial.mail.MailSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by i.lopushen on 22/06/2016.
 */
@SpringBootApplication
public class LopSpringTutorial {
    public static void main(String[] args) {
        SpringApplication.run(LopSpringTutorial.class);
    }
}
