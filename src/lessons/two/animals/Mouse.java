package lessons.two.animals;

import lessons.two.animals.interfaces.Run;
import lessons.two.animals.interfaces.Voice;

public class Mouse extends Herbivore implements Run, Voice {

    public String voice() {
        return "Mouse squeaks";
    }

    public void run() {
        System.out.println("Mouse is running");
    }
}
