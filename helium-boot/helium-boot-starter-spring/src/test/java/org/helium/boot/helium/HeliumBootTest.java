package org.helium.boot.helium;

import org.helium.boot.spring.annotation.EnableHeliumConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHeliumConfiguration
@SpringBootApplication
public class HeliumBootTest {

    public static void main(String[] args) {
        SpringApplication.run(HeliumBootTest.class, args);
    }


}
