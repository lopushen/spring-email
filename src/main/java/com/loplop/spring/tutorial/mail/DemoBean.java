package com.loplop.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class DemoBean {

    private static Log log = LogFactory.getLog(DemoBean.class);
    public DemoBean() {
        log.info("Demo Bean created");
    }

    public String foo() {
        return "something";
    }
}
