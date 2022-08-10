package com.softwareinstitute.training.raj.singh.vet;

public class Cat extends Mammal{

    private int killTotal;

    public int getKillTotal() {
        return killTotal;
    }

    public void setKillTotal(int killTotal) {
        this.killTotal = killTotal;
    }

    public Cat(String name, int age, String gender, int HP, int killTotal ,boolean isDead) {
        super(name, age, gender ,HP, isDead);
        this.killTotal = killTotal;
    }

    @Override
    public String eat() {
        return (this.name+" is a meat eater");
    }

    String speak(){
        return ("Meow");
    }







}
