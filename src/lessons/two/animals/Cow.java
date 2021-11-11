package lessons.two.animals;

import lessons.two.animals.interfaces.Run;
import lessons.two.animals.interfaces.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public String voice() {
        return "Cow hums";
    }

    public void run() {
        System.out.println("Cow is running");
    }
}
