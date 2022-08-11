
package com.softwareinstitute.training.raj.singh.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class BatTest {

    @Test
    void get_batName(){
        Bat bat = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("Bax", bat.getName());
    }
    @Test
    void get_batAge(){
        Bat bat2 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals(22, bat2.getAge());
    }
    @Test
    void get_batDead(){
        Bat bat3 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals(true, bat3.isDead());
    }
    @Test
    void get_batFood(){
        Bat bat4 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("Bax eats night-flying insects", bat4.eat(), "the bat is not hungry");
    }

    @Test
    void get_batTakeFlight(){
        Bat bat5 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("Bax takes flight", bat5.takeFlight(), "the bat is not taking flight");
    }

    @Test
    void get_batFlight(){
        Bat bat6 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("Bax is flying at night", bat6.flight(), "the bat is not flying");
    }

    @Test
    void get_batLanding(){
        Bat bat7 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("Bax is beginning to land", bat7.landing(), "the bat is not landing");
    }
    @Test
     void get_batSpeak(){
        Bat bat8 = new Bat("Bax", 22, "Female", 100, true);
        assertEquals("eee",bat8.speak(), "the bat is not speaking");

    }

}
