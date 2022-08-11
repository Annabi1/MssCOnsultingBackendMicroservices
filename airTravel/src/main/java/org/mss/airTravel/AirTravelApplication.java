package org.mss.airTravel;

import java.sql.Time;

import java.util.Date;
import java.util.List;


import org.mss.airTravel.model.Travel;
import org.mss.airTravel.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
@EnableEurekaClient
public class AirTravelApplication {
@Autowired
private TravelRepository travelRepo;
	public static void main(String[] args) {
		SpringApplication.run(AirTravelApplication.class, args);

		System.out.println("************************* start ************************* ");
		
	}
	
	/*
	 * @Bean CommandLineRunner runner() { return args -> {
	 * 
	 * Travel travel=new Travel(); travel.setDestination("Air soussa");
	 * travel.setCompany("mss consulting"); travel.setMaxCapacity(20);
	 * 
	 * travel.setAvailable(false); travelRepo.save(travel);
	 * 
	 * 
	 * 
	 * };
	 * 
	 * }
	 */
	
}