package com.softwareinstitute.training.raj.singh.vet;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(String name, int age, int HP, boolean isDead) {
        super(name, age, HP, isDead);
    }

    @Override
    public String eat() {
        return (this.name+" eats insects");
    }

    public String speak(){
        return ("coo");
    }

    @Override
    public String takeFlight() {
        return(this.name +" is beginning to take flight");
    }

    @Override
    public String flight() {
        return(this.name+" is flying");
    }

    @Override
    public String landing() {
        return(this.name+" is landing");
    }
}
