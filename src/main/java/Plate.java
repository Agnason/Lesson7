import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public boolean isFoodEnough(Cat cat) {
        if (food >= cat.getAppetite())
            return true;
        return false;
    }

    public void increaseFood(Cat cat) {
        do {
            System.out.println("А вот теперь котам еды уже не хватает.Сколько еды добавим?");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            food += user;
        }
        while (!isFoodEnough(cat));

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        if (food >= 0) {
            System.out.println("В тарелке есть " + food + " eды");
        } else System.out.println("в тарелке нет еды");
    }
}

