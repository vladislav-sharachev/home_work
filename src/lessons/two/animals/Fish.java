package lessons.two.animals;

import lessons.two.animals.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {

    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public String voice() {
        return null;
    }
}
