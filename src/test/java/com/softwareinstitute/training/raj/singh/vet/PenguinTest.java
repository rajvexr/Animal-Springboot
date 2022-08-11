package com.softwareinstitute.training.raj.singh.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PenguinTest {

    @Test
    void get_PenguinFood() {
        Penguin penguin = new Penguin("Buffy", 12, 100, false);
        assertEquals("Buffy eats krill, squids, and fishes", penguin.eat(), "the penguin is not eating");
    }

    @Test
    void get_PenguinPoop(){
        Penguin penguin2 = new Penguin("Buffy", 12, 100, false);
        assertEquals("the animal is pooping", penguin2.poop(), "the penguin is not pooping");
    }

    @Test
    void get_PenguinMove(){
        Penguin penguin3 = new Penguin("Buffy", 12, 100, false);
        assertEquals("the animal is moving", penguin3.move(), "the penguin is not moving");
    }

    @Test
    void get_PenguinCheckAge(){
        Penguin penguin4 = new Penguin("Buffy", 12, 100, false);
        assertEquals(12, penguin4.getAge());
    }

}