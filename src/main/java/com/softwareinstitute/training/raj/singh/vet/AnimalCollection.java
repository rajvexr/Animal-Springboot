package com.softwareinstitute.training.raj.singh.vet;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {

    List<Animals> animalCollection = new ArrayList();

    public AnimalCollection(){
        this.animalCollection.add(new Cat("Dave"));
        this.animalCollection.add(new Cat("James"));
    }

    public List<Animals> getAnimalCollection() {
        return this.animalCollection;
    }

    public String toString(){
        String json = new Gson().toJson(animalCollection);
        return json;
    }
}
