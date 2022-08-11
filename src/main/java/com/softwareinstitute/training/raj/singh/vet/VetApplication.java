package com.softwareinstitute.training.raj.singh.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class VetApplication {

	public static AnimalCollection myAnimalCollection = new AnimalCollection();

	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}


	//@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute") //http://localhost:8080/customRoute
	public String myResponse() {
		return myAnimalCollection.toString();
	}

	@PutMapping("/change/{id}")
	@ResponseBody
	public void change(@PathVariable int id, @RequestParam String name, @RequestParam int age, @RequestParam String gender, @RequestParam int hp, @RequestParam int killTotal, @RequestParam boolean isDead){
		myAnimalCollection.changeCat(id, new Cat(name, age, gender, hp, killTotal, isDead));
	}

	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String name, @RequestParam int age, @RequestParam String gender, @RequestParam int hp, @RequestParam int killTotal, @RequestParam boolean isDead) {
		myAnimalCollection.addCat(new Cat(name, age, gender, hp, killTotal, isDead));
	}



}
