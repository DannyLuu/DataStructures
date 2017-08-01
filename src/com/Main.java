package com;

import com.algorithms.LinkedListAlgorithms;
import com.datastructures.queues.AnimalShelter;

public class Main {
    private static LinkedListAlgorithms linkedListAlgorithms = new LinkedListAlgorithms();

    public static void main(String[] args) {
        AnimalShelter animalShelter = generateAnimalShelter();

        System.out.println("Adopt the first pet: " + animalShelter.dequeueAny().getAnimalName());
        System.out.println("Adopt the first cat: " + animalShelter.dequeueCat().getAnimalName());
        System.out.println("Adopt the first dog: " + animalShelter.dequeueDog().getAnimalName());
        System.out.println("Adopt the first cat: " + animalShelter.dequeueCat().getAnimalName());
        System.out.println("Adopt the first pet: " + animalShelter.dequeueAny().getAnimalName());
        System.out.println("Adopt the first cat: " + animalShelter.dequeueCat().getAnimalName());
    }

    public static  AnimalShelter generateAnimalShelter() {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue("Bailey", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Max", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Bella", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Mason", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Buddy", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Drake", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Tiger", AnimalShelter.PetType.CAT);
        animalShelter.enqueue("Smokey", AnimalShelter.PetType.CAT);
        animalShelter.enqueue("Suki", AnimalShelter.PetType.CAT);
        animalShelter.enqueue("Kitty", AnimalShelter.PetType.CAT);
        animalShelter.enqueue("Lilly", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Grant", AnimalShelter.PetType.DOG);
        animalShelter.enqueue("Judy", AnimalShelter.PetType.CAT);
        animalShelter.enqueue("Thida", AnimalShelter.PetType.CAT);

        return animalShelter;
    }
}
