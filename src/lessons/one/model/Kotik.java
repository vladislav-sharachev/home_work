package lessons.one.model;

public class Kotik {

    private static int countOfInstances;
    private int satietyLevel;
    private String food;
    private String name;
    private int weight;
    private int prettiness;
    private String mew;
    private String kittyMsg;

    public Kotik() {
        countOfInstances++;
    }

    public Kotik(int prettiness, String name, int weight, String mew) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.mew = mew;
        countOfInstances++;
    }

    public void setKotik(int prettiness, String name, int weight, String mew) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.mew = mew;
    }

    public int getCountOfInstances() {
        return countOfInstances;
    }

    public String getMew() {
        return mew;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    private boolean isKotikFull() {
        return satietyLevel > 0;
    }

    private int getRandomNum() {
        return (int) (Math.random() * 5 + 1);
    }

    public boolean play() {
        return isKotikFull();
    }

    public boolean sleep() {
        return isKotikFull();
    }

    public boolean chaseMouse() {
        return isKotikFull();
    }

    public boolean lick() {
        return isKotikFull();
    }

    public void eat(int satietyLevel) {
        this.satietyLevel = satietyLevel;
    }

    public void eat(int satietyLevel, String food) {
        this.satietyLevel = satietyLevel;
        this.food = food;
    }

    private void eat() {
        eat(satietyLevel, food);
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            switch (getRandomNum()) {
                case 1:
                    kittyMsg = play() ? "Kitty is playing" : "Kitty wants to eat!";
                    break;
                case 2:
                    kittyMsg = sleep() ? "Kitty is sleeping" : "Kitty wants to eat!";
                    break;
                case 3:
                    kittyMsg = chaseMouse() ? "Kitty is chasing a mouse" : "Kitty wants to eat!";
                    break;
                case 4:
                    kittyMsg = lick() ? "Kitty is licking" : "Kitty wants to eat!";
                    break;
                default:
                    eat();
                    kittyMsg = "Kotik is eating";
            }
            System.out.println(i + ". " + kittyMsg + ", " + satietyLevel);
        }
    }
}

