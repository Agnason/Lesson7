import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // сытость (голодный - false, сытый - true)

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;// при создании кота, должен быть всегда голодный
    }

    public void info() {
        System.out.printf("Имя кота = %s, Сытость = %s, Аппетит= %s", name, satiety, appetite);
        System.out.println("");
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.isFoodEnough(this)) {
            p.decreaseFood(appetite);
            infoWhenCatSatiety();
        } else {
            p.increaseFood(this);
            p.decreaseFood(appetite);
            infoWhenCatSatiety();
        }
    }

    public void infoWhenCatSatiety() {
        System.out.printf("Кот %s съел %s eды", name, appetite);
        System.out.println();
        setSatiety(true);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
