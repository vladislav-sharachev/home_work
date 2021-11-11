package lessons.two;

import lessons.two.animals.*;
import lessons.two.foods.Grass;
import lessons.two.foods.Meat;

public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Seal seal = new Seal();
        Fish fish = new Fish();
        Mouse mouse = new Mouse();
        Wolf wolf = new Wolf();

        worker.feed(wolf, meat)
                .feed(wolf, grass)
                .feed(mouse, meat)
                .feed(mouse, grass)
                .getVoice(mouse)
                .getVoice(cow)
                .getVoice(duck);

        Carnivorous[] pond = {fish, seal, wolf};

        for (Carnivorous animals : pond) {
            animals.swim();
        }
    }
}
