package animals;

import food.Food;
import food.Grass;
import origins.*;

public class Horse extends Animal implements Land, Herbivore {
    public Horse(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Horse with name " + this.name + " is walking.");
    }

    public void eatGrass(Food food) {
        if (food instanceof Grass) {
            System.out.println("Horse with name " + this.name + " is eating grass.");
        } else {
            System.out.println("Horses don't eat this type of food (" + food + ").");
        }
    }
}
