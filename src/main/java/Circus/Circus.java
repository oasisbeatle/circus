package Circus;

import Circus.animal.Animal;
import Circus.animal.Duck;
import Circus.animal.Parrot;
import Circus.stuff.Cannon;
import Circus.stuff.Equipment;
import Circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }

            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        //makeAnimalsTalk();
        //System.out.println("Total value of equipments " + calculateValue(equipments));
        //System.out.println("Total value of animals " + calculateValue(animals));

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

        animalArrayList.add(new Duck("Goose"));
        animalArrayList.add(new Parrot("Dolly"));

        Duck louie = new Duck("Louie");
        animalArrayList.add(louie);

        for(Animal a: animalArrayList){
            System.out.println(a);
        }

        System.out.println("Number of animals:  " + animalArrayList.size());
        System.out.println("Index of louie:  " + animalArrayList.indexOf(louie));

         animalArrayList.sort(Animal.AnimalNameComparator);

        for(Animal a: animalArrayList){
            System.out.println(a);
        }

        animalArrayList.remove(louie);
        System.out.println("Index of louie:  " + animalArrayList.indexOf(louie));


    }
}
