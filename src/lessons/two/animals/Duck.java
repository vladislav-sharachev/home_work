package lessons.two.animals;

import lessons.two.animals.interfaces.Fly;
import lessons.two.animals.interfaces.Run;
import lessons.two.animals.interfaces.Swim;
import lessons.two.animals.interfaces.Voice;

public class Duck extends Herbivore implements Fly, Run, Voice, Swim {

    public String voice() {
        return "Duck quacks";
    }

    public void run() {
        System.out.println("Duck is running");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}
