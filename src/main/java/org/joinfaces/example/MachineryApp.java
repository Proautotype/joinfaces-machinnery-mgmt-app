package org.joinfaces.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Lars Grefer
 */
@SpringBootApplication
public class MachineryApp extends SpringBootServletInitializer {
    private final static Logger log = LoggerFactory.getLogger(MachineryApp.class);
    public static void main(String[] args) {
        SpringApplication.run(MachineryApp.class, args);
    }
}
