package com.softwareinstitute.training.raj.singh.vet;

public abstract class Mammal extends Animals {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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




