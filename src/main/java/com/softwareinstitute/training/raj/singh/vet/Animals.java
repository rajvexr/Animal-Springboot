package com.softwareinstitute.training.raj.singh.vet;

public abstract class Animals {

    //////////////////////////
    /////abstract methods\\\\\
    //////////////////////////

    abstract String breathe();

    abstract String eat();

    abstract String breed();

    ////////////////////
    /////attributes\\\\\
    ////////////////////

    protected String name;

    private int age;

    private boolean isDead;

    private int hp;

    /////////////////////
    /////constructor\\\\\
    /////////////////////
    protected Animals(String name, int age, int hp, boolean isDead){
        this.name= name;
        this.age = age;
        this.hp = hp;
        this.isDead = isDead;
    }

    /////////////////////////////
    /////getters and setters\\\\\
    /////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDead() {
        return isDead;
    }


    //////////////////
    /////methods\\\\\
    /////////////////

    public String sleep() {
        return ("the animal is sleeping");
    }

    public String move() {
        return ("the animal is moving");
    }

    public String poop() {
        return ("the animal is pooping");
    }

    void checkAge( int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be a negative value");
        }
    }

    @Override
    public String toString(){
        return "{" +
                "\"name\"= \"" + name +
                "\", \"age\"=\"" + age +
                "\", \"HP\"=\"" + hp +
                "\", \"isDead\"" + isDead + "\"}";
    }

}
