package com.softwareinstitute.training.raj.singh.vet;

public abstract class Bird extends Animals{


    protected Bird(String name, int age, int HP, boolean isDead) {
        super(name, age, HP, isDead);
    }

    @Override
    public String breathe() {
        return (this.name+" is breathing");
    }

    @Override
    public String breed() {
        return (this.name+" lays eggs");
    }
}
