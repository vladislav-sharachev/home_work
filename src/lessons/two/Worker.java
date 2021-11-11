package lessons.two;

import lessons.two.animals.Animal;
import lessons.two.animals.Fish;
import lessons.two.animals.exception.AnimalHasNoVoiceException;
import lessons.two.foods.Food;

public class Worker {

    public Worker feed(Animal animal, Food food) {
        animal.eat(food);
        return this;
    }

    public Worker getVoice(Animal animal) {
        if (animal.getClass().equals(Fish.class)) {
            throw new AnimalHasNoVoiceException();
        }
        System.out.println(animal.voice());
        return this;
    }
}
