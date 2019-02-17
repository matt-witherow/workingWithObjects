package pettingzoo;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     *   This pettingzoo is intended to be _hectic_
     *   This lesson is mostly at the whiteboard.
     *   Setting context for another workshop.
     *
     *   Inhertience
     *      Hierarchies.
     *
     *   abstract
     *      Classes.
     *      Methods.
     *
     *   Notes for Matt
     *      - I want only birds to Fly Away when asked to speak. Dogs remain compliant.
     *      - Add models and 'group' ideas.
     *      - Flying Fox?
     *
     */
    
    public static void main(String[] args) {

        List<Animal> zoo = Arrays.asList(
                new Dog("Rex"),
                new Bird("Polly"),
                new Dog("Fido"),
                new Bird("Geoff"));

        for(Animal a : zoo){
            System.out.println(a.speak());
        }
    }
}
