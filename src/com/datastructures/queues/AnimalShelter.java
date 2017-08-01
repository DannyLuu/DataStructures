package com.datastructures.queues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Optional;

/**
 * <b>Interview Question - Stacks and Queues</b><br/>
 * <b>3.6</b>
 * Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out"
 * basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can
 * select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot
 * select which specific animal they would like. Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat. You may use the built-in Linked List data
 * structure.
 */
public class AnimalShelter {

    LinkedList<AnimalNode> animals = new LinkedList();

    public enum PetType {
        CAT,
        DOG;
    }

    public static class AnimalNode {
        String animalName;
        PetType petType;

        public AnimalNode(String animalName, PetType petType) {
            this.animalName = animalName;
            this.petType = petType;
        }

        public String getAnimalName() {
            return animalName;
        }

        public PetType getPetType() {
            return petType;
        }
    }

    public void enqueue(String animalName, PetType petType) {
        AnimalNode animal = new AnimalNode(animalName, petType);
        animals.add(animal);
    }

    public AnimalNode dequeueAny() {
        if (animals.isEmpty()) {
            throw new EmptyStackException();
        }

        return animals.removeFirst();
    }

    private AnimalNode dequeueAnimal(PetType petType) {
        if (animals.isEmpty()) {
            throw new EmptyStackException();
        }

        Optional<AnimalNode> oldestPetType = animals.stream().filter(a -> a.petType.equals(petType)).findFirst();

        if (!oldestPetType.isPresent()) {
            throw new EmptyStackException();
        }

        AnimalNode animal = oldestPetType.get();
        animals.remove(animal);

        return animal;
    }

    public AnimalNode dequeueDog() {
      return dequeueAnimal(PetType.DOG);
    }

    public AnimalNode dequeueCat() {
        return dequeueAnimal(PetType.CAT);
    }

}
