package org.abhinavgpt.serviceregistryquizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryQuizAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryQuizAppApplication.class, args);
    }

}
