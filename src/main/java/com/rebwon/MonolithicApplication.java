package com.rebwon;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MonolithicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonolithicApplication.class, args);
    }

    public static class SampleRunner implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {

        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void handle() {
        System.out.println("Logging");
    }
}
