package com.fiveplus;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class TestApplication {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.INFO;
    }

    public static void main(String[] args){
        SpringApplication.run(TestApplication.class,args);
    }

}
