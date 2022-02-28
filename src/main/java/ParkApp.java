package com.LabsDevOpsR;

import com.LabsDevOpsR.entity.ParkRide;
import com.LabsDevOpsR.repository.RideRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import java.util.Collections;

@SpringBootApplication
public class ParkApp  {
    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(ParkApp.class);

        // app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
        app.run(args);
    }

    @Bean
    public CommandLineRunner sampleData(RideRepository repository) {
        return (args) -> {
            repository.save(new ParkRide("Camel", "Enjoy park view sitting on Camel back .", 100, 5));
            repository.save(new ParkRide("Elephant", "Enjoy park view sitting on Elephant back.", 200, 5));
            repository.save(new ParkRide("Toy Train", "Move around in park by Train.", 20, 1));
        };
    }
}
