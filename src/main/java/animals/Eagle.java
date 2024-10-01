package animals;

import food.Food;
import food.Meat;
import origins.*;

public class Eagle extends Animal implements Flying, Predator {
    public Eagle(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Eagle with name " + this.name + " is flying.");
    }

    public void eatMeat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Eagle with name " + this.name + " is eating meat.");
        } else {
            System.out.println("Eagles don't eat this type of food (" + food + ").");
        }
    }
}
