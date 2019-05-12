package com.example.asciidoctorexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Hello World!");
    }
}
