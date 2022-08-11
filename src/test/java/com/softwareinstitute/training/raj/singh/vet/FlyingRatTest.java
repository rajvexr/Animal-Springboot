package com.softwareinstitute.training.raj.singh.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyingRatTest {

    @Test
    void get_flyingRatName(){
        FlyingRat flyingrat = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo", flyingrat.getName(), "this is not the name");
    }
    @Test
    void get_flyingRatAge(){
        FlyingRat frat2 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals(15, frat2.getAge(), "this age is not the name");
    }
    @Test
    void get_flyingRatDead(){
        FlyingRat frat3 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals(true, frat3.isDead(), "the flyingRat is not dead");
    }

    @Test
    void get_flyingRatFood(){
        FlyingRat frat4 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo eats insects", frat4.eat(), "the flyingRat is not dead");
    }

    @Test
    void get_flyingRatTakeFlight(){
        FlyingRat frat5 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo is beginning to take flight", frat5.takeFlight(), "the flyingRat is not taking flight");
    }

    @Test
    void get_flyingRatFlight(){
        FlyingRat frat6 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo is flying", frat6.flight(), "the flyingRat is not flying");
    }

    @Test
    void get_flyingRatLanding(){
        FlyingRat frat7 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo is landing", frat7.landing(), "the flyingRat is not landing");
    }

    @Test
    void get_flyingratBreathing(){
        FlyingRat frat8 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo is breathing",frat8.breathe(), "the flying rat is not breathing");
    }

    @Test
    void get_flyingRatBreed(){
        FlyingRat frat9 = new FlyingRat("Cosmo", 15, 100, true);
        assertEquals("Cosmo lays eggs", frat9.breed(), "the flying rat is not breeding");
    }

}
