package com.springproperties;

import com.springproperties.properties.MySelfProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPropertiesApplication implements CommandLineRunner {
    @Autowired
    private MySelfProperty mySelfProperty;

    public static void main(String[] args) {
        SpringApplication.run(SpringPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n" + mySelfProperty.toString());
        System.out.println();
    }
}
