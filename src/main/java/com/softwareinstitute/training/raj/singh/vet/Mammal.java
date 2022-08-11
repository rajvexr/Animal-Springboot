package com.softwareinstitute.training.raj.singh.vet;

public abstract class Mammal extends Animals {

    private String gender;


    protected Mammal(String name, int age, String gender, int HP, boolean isDead) {
        super(name, age, HP, isDead);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    String breathe() {
        return (this.name + " is breathing");
    }

    @Override
    String breed() {
        return (this.name+ " is having a Live birth");
    }


    }




