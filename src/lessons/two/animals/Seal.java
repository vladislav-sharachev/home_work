package lessons.two.animals;

import lessons.two.animals.interfaces.Voice;

public class Seal extends Carnivorous implements Voice {

    public String voice() {
        return "Seal screams";
    }

    public void swim() {
        System.out.println("Seal is swimming");
    }
}
