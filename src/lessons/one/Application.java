package lessons.one;

import lessons.one.model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik(10, "Kotik", 20, "111");
        Kotik pussy = new Kotik();
        pussy.setKotik(11, "Pussya", 19, "Meeaw!");
        pussy.eat(1, "Whiskas");
        kotik.liveAnotherDay();

        System.out.println("Name is: " + kotik.getName() + ", weight is: " + kotik.getWeight());
        System.out.println("Do the meows match? " + kotik.getMew().equalsIgnoreCase(pussy.getMew()));
        System.out.println(kotik.getCountOfInstances());
    }
}