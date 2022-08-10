package com.softwareinstitute.training.raj.singh.vet;

public class Cat extends Mammal{

    private int killTotal;

    public int getKillTotal() {
        return killTotal;
    }

    public void setKillTotal(int killTotal) {
        this.killTotal = killTotal;
    }

    public Cat(){
        setAge(5);
        setName("Dave");
        setKillTotal(4);
        setDead(true);
        setGender("Female");
        setHP(100);
        setAttack(10);
    }

    @Override
    public String eat() {
        return (getName()+" is a meat eater");
    }

    String speak(){
        return ("Meow");
    }







}
