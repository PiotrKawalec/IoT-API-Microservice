package io.pivotal.sensor;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class IotAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotAPIApplication.class, args);
    }
}
