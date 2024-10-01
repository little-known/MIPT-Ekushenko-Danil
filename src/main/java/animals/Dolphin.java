package animals;

import food.Food;
import food.Fish;
import origins.*;

public class Dolphin extends Animal implements Waterfowl, Predator {
    public Dolphin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Dolphin with name " + this.name + " is swimming.");
    }

    public void eatMeat(Food food) {
        if (food instanceof Fish) {
            System.out.println("Dolphin with name " + this.name + " is eating fish.");
        } else {
            System.out.println("Dolphins don't eat this type of food (" + food + ").");
        }
    }
}
