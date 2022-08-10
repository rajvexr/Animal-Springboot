package com.softwareinstitute.training.raj.singh.vet;

public class Cat extends Mammal{

    private int killTotal;

    public int getKillTotal() {
        return killTotal;
    }

    public void setKillTotal(int killTotal) {
        this.killTotal = killTotal;
    }

    public Cat(String name, String gender){
        super(name, gender);

    }

    public void catAttack(Animals target){
        target.getHP();
    }

    @Override
    public String eat() {
        return (getName()+" is a meat eater");
    }

    String speak(){
        return ("Meow");
    }







}
