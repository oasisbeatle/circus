package Circus;

import Circus.animal.Animal;
import Circus.animal.Bird;
import Circus.animal.Duck;
import Circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(a);
        train(new Duck());
        train(new Parrot());
        //Circus.Circus.animal.Animal a2 = new Circus.Circus.animal.Animal();
        //ABird b2 = new Circus.animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if(bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
