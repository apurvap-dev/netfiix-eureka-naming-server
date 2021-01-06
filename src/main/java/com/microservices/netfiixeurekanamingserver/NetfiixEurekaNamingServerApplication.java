package com.microservices.netfiixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetfiixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfiixEurekaNamingServerApplication.class, args);
	}

}
