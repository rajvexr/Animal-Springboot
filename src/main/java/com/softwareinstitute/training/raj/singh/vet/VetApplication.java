package com.softwareinstitute.training.raj.singh.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VetApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}
	//@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse() {
		AnimalCollection animalCollection = new AnimalCollection();
		return animalCollection.toString();
	}

}
