package com.softwareinstitute.training.raj.singh.vet;

public class Penguin extends Bird{

    public Penguin(String name, int age, int hp, boolean isDead) {
        super(name, age, hp, isDead);
    }

    @Override
    public String eat() {
        return (this.name+" eats krill, squids, and fishes");
    }
    
}
