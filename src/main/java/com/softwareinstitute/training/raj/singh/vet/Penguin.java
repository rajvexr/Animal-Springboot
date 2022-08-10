package com.softwareinstitute.training.raj.singh.vet;

public class Penguin extends Bird{



    public Penguin(){
        setAge(9);
        setName("Bob");
        setDead(false);
        setHP(100);
        setAttack(20);
    }


    @Override
    public String eat() {
        return (getName()+" eats krill, squids, and fishes");
    }
    
}
