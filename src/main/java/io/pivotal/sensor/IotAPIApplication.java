package io.pivotal.sensor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient

//hystrix
@EnableCircuitBreaker
@EnableHystrixDashboard
//hystrix
public class IotAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotAPIApplication.class, args);
    }
}
