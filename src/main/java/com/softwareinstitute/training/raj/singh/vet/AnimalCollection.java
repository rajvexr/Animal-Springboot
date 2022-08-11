package com.softwareinstitute.training.raj.singh.vet;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {

    List<Animals> animalCollection = new ArrayList();

    public AnimalCollection(){
        this.animalCollection.add(new Cat("Tom", 7, "Male", 100, 5, false));
        this.animalCollection.add(new Bat("Bax", 22, "Female", 100, true));
        this.animalCollection.add(new FlyingRat("Cosmo", 15, 100, true));
        this.animalCollection.add(new Penguin("Buffy", 12, 100, false));

    }

    public List<Animals> getAnimalCollection() {
        return this.animalCollection;
    }

    public String toString(String json){
        return json = new Gson().toJson(animalCollection);
    }
}
