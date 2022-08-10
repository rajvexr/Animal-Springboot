package com.softwareinstitute.training.raj.singh.vet;

public abstract class Bird extends Animals{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
