package animals;

import food.Food;
import food.Grass;
import origins.*;

public class Camel extends Animal implements Land, Herbivore {
    public Camel(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Camel with name " + this.name + " is walking.");
    }

    public void eatGrass(Food food) {
        if (food instanceof Grass) {
            System.out.println("Camel with name " + this.name + " is eating grass.");
        } else {
            System.out.println("Camels don't eat this type of food (" + food + ").");
        }
    }
}
