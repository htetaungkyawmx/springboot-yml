package com.example.springbootyml;

import com.example.springbootyml.configuration.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.sql.SQLOutput;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfiguration.class)
public class SpringbootYmlApplication implements CommandLineRunner {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootYmlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Configuration injected from properties:");
        System.out.println(applicationConfiguration);

    }
}
