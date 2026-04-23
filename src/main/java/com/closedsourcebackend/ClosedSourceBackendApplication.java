package com.closedsourcebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ClosedSourceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClosedSourceBackendApplication.class, args);
    }

}
