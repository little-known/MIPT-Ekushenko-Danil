package org.example;

import animals.*;
import food.*;

public class Main {
    public static void main(String[] args) {
        Camel camel = new Camel("John");
        Dolphin dolphin = new Dolphin("Boris");
        Eagle eagle = new Eagle("KillerOhotnikUbiyca");
        Horse horse = new Horse("Skakun");
        Tiger tiger = new Tiger("PolosatyChel");

        Grass grass = new Grass();
        Meat meat = new Meat();
        Beef beef = new Beef();
        Fish fish = new Fish();

        System.out.println("CAMEL EXAMPLE:");
        camel.walk();
        camel.eatGrass(meat);
        camel.eatGrass(fish);
        camel.eatGrass(grass);

        System.out.println("\nDOLPHIN EXAMPLE");
        dolphin.swim();
        dolphin.eatMeat(grass);
        dolphin.eatMeat(meat);
        dolphin.eatMeat(fish);

        System.out.println("\nEAGLE EXAMPLE:");
        eagle.fly();
        eagle.eatMeat(meat);
        eagle.eatMeat(fish);
        eagle.eatMeat(beef);
        eagle.eatMeat(grass);

        System.out.println("\nHORSE EXAMPLE:");
        horse.walk();
        horse.eatGrass(meat);
        horse.eatGrass(fish);
        horse.eatGrass(grass);

        System.out.println("\nTIGER EXAMPLE:");
        tiger.walk();
        tiger.eatMeat(fish);
        tiger.eatMeat(meat);
        tiger.eatMeat(beef);
    }
}
