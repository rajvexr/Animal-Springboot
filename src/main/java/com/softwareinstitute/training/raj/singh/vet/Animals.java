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

    private int HP;

    /////////////////////
    /////constructor\\\\\
    /////////////////////
    public Animals(String name, int age, int HP, boolean isDead){
        this.name= name;
        this.age = age;
        this.HP = HP;
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

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
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

    public void setDead(boolean dead) {
        this.isDead = isDead;
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
                "\", \"HP\"=\"" + HP +
                "\", \"isDead\"" + isDead + "\"}";
    }

}
