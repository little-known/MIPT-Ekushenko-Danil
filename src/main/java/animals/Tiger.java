package animals;

import food.Food;
import food.Beef;
import origins.*;

public class Tiger extends Animal implements Land, Predator {
    public Tiger(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Tiger with name " + this.name + " is walking.");
    }

    public void eatMeat(Food food) {
        if (food instanceof Beef) {
            System.out.println("Tiger with name " + this.name + " is eating beef.");
        } else {
            System.out.println("Tigers don't eat this type of food (" + food + ").");
        }
    }
}
