public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // сытость (голодный - false, сытый - true)

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;// при создании кота, должен быть всегда голодный
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.printf("Имя кота = %s, Сытость = %s", name, satiety);
        System.out.println("");
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.isFoodEnough(this)) {
            p.decreaseFood(appetite);
            setSatiety(true);
        }
        infoWhenCatEat();
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void infoWhenCatEat() {
        if (isSatiety() == true) {
            System.out.printf("Кот %s съел %s eды", name, appetite);
            System.out.println();
        }else {
            System.out.println("Коту " + name + " не досталось еды");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
