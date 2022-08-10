package com.softwareinstitute.training.raj.singh.vet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VetApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void get_cat_getAge(){
		Cat cat = new Cat();
		assertEquals(5, cat.getAge(), "That not the same age");

	}
	@Test
	void get_canEater(){
		Cat cat2 = new Cat();
		assertEquals("Dave is a meat eater", cat2.eat(), "This is not it");

	}
	@Test
	void get_sleeping(){
		Cat cat3 = new Cat();
		assertEquals("the animal is sleeping", cat3.sleep(), "the animal is not sleeping");
	}
	@Test
	void get_catName(){
		Cat cat4 = new Cat();
		assertEquals("Dave", cat4.getName(), "That is not the cats name");
	}
	@Test
	void get_killTotal(){
		Cat cat5 = new Cat();
		assertEquals(4, cat5.getKillTotal(), "the cat didn't kill that many times!");

	}
	@Test
	void is_dead(){
		Cat cat6 = new Cat();
		assertEquals(true, cat6.isDead(), "the cat is not dead");
	}
	@Test
	void get_catGender(){
		Cat cat7 = new Cat();
		assertEquals("Female", cat7.getGender(), "that is not the correct gender of the cat");
	}
	@Test
	void get_CatHP(){
		Cat cat8 = new Cat();
		assertEquals(100, cat8.getHP(), "that is not the cats health");
	}
	@Test
	void cat_speaks(){
		Cat cat9 = new Cat();

	}

}
