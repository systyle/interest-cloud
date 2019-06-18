package com.interest.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZipkinServer
public class InterestZipkinlApplication {


    public static void main(String[] args) {
        SpringApplication.run(InterestZipkinlApplication.class, args);
    }

}
