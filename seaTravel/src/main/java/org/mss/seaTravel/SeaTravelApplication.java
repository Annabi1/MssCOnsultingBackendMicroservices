package org.mss.seaTravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SeaTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeaTravelApplication.class, args);
	}

}
