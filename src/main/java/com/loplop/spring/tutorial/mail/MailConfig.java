package com.loplop.spring.tutorial.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by i.lopushen on 22/06/2016.
 */
@Configuration
public class MailConfig {

    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

    @Bean
    @ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo",matchIfMissing = true)
    public MailSender mockMailSender()
    {
        return new MockMailSender();
    }

    @Bean
    @ConditionalOnProperty(name = "spring.mail.host")
    public MailSender smtpMailSender(JavaMailSender javaMailSender)
    {
        demoBean().foo();
        SmtpMailSender smtpMailSender = new SmtpMailSender();
        smtpMailSender.setJavaMailSender(javaMailSender);
        return smtpMailSender;
    }
}
