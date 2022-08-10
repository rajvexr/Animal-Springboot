package com.softwareinstitute.training.raj.singh.vet;

public class Animal {

    private String name;
    private int age;

    private String type;

    public Animal(String type,String name,int age){
        this.type = type;
        this.name= name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "{" + "\"type\"" + type + "\", \"name\"=\"" + name + "\", \"age\"=\"" + age + "\"}";
    }

}
