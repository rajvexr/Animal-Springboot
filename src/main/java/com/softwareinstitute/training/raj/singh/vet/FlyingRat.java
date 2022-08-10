package com.softwareinstitute.training.raj.singh.vet;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(){
        setName("Rat");
        setAge(6);
        setDead(true);
        setHP(100);
        setAttack(10);
    }

    @Override
    public String eat() {
        return (getName()+" eats insects");
    }

    public String speak(){
        return ("coo");
    }

    @Override
    public String takeFlight() {
        return(getName() +" is beginning to take flight");
    }

    @Override
    public String flight() {
        return(getName()+" is flying");
    }

    @Override
    public String landing() {
        return(getName()+" is landing");
    }
}
