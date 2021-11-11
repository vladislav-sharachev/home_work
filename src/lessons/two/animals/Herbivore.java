package lessons.two.animals;

import lessons.two.foods.Food;
import lessons.two.foods.Meat;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Warning! Herbivore does not eat a meat!");
        }
    }
}