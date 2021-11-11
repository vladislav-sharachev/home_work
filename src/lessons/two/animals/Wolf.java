package lessons.two.animals;

import lessons.two.animals.interfaces.Run;
import lessons.two.animals.interfaces.Voice;

public class Wolf extends Carnivorous implements Run, Voice {

    public String voice() {
        return "Wolf howls";
    }

    public void run() {
        System.out.println("Wolf is running");
    }

    public void swim() {
        System.out.println("Wolf is swimming");
    }
}
