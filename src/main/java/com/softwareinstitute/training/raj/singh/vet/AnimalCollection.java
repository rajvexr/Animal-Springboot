package com.softwareinstitute.training.raj.singh.vet;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {

    List<Animal> animalCollection = new ArrayList();

    public AnimalCollection(){
        this.animalCollection.add(new Animal("john", "5", 5));
    }

    public List<Animal> getAnimalCollection() {
        return this.animalCollection;
    }

    public String toString(){
        String json = new Gson().toJson(animalCollection);
        return json;
    }
}
