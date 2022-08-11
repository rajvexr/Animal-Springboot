package com.softwareinstitute.training.raj.singh.vet;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {

    List<Animals> animalCollection = new ArrayList();

    public AnimalCollection(){
        this.animalCollection.add(new Cat("Tom", 14, "Male", 100, 5, true));
        this.animalCollection.add(new Cat("Bob", 9, "Female", 100, 4, false));
        this.animalCollection.add(new Cat("Dave", 20, "Male", 100, 9, true));
        this.animalCollection.add(new Cat("Jim", 15, "Female", 100, 12, false));
        /*this.animalCollection.add(new Bat("Bax", 22, "Female", 100, true));
        this.animalCollection.add(new FlyingRat("Cosmo", 15, 100, true));
        this.animalCollection.add(new Penguin("Buffy", 12, 100, false));*/

    }

    public List<Animals> getAnimalCollection() {
        return this.animalCollection;
    }

    public String toString(){
        String json = new Gson().toJson(animalCollection);
        return json;
    }

    public void addCat(Cat c) {
        this.animalCollection.add(c);
    }

    public void changeCat(int id, Cat c){
        this.animalCollection.set(id,c);
    }

}
