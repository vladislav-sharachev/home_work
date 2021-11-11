package lessons.two.animals;

import lessons.two.animals.interfaces.Swim;
import lessons.two.foods.Food;
import lessons.two.foods.Grass;

public abstract class Carnivorous extends Animal implements Swim {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Warning! Carnivorous does not eat a grass!");
        }
    }

    public abstract void swim();
}