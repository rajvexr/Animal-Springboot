package com.softwareinstitute.training.raj.singh.vet;

public class Bat extends Mammal implements Flying{

    public Bat(String name, int age, String gender, int HP,boolean isDead) {
        super(name, age, gender ,HP, isDead);
    }

    @Override
    public String eat() {
        return (this.name+" eats night-flying insects");
    }

    public String speak(){
        return("eee");
    }

    @Override
    public String takeFlight() {
        return(this.name+ " takes flight");
    }

    @Override
    public String flight() {
        return(this.name+ " is flying at night");
    }

    @Override
    public String landing() {
        return(this.name+" is beginning to land");
    }
}
