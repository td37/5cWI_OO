package at.td.test;

import at.td.wintergame.Observer;

import java.util.ArrayList;
import java.util.List;

public class PetStore {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void printNameOfAnimals(){
        for (Animal animal: animals) {
            System.out.println(animal.getName());
        }
    }
}
