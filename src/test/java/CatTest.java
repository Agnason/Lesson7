import java.util.ArrayList;
import java.util.List;

public class CatTest {

    public static void main(String[] args) {

        Cat cat[] = new Cat[5];
        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat("Вася", 40);
        cat[2] = new Cat("Тосик", 31);
        cat[3] = new Cat("Чарли", 40);
        cat[4] = new Cat("Боб", 31);

        Plate plate = new Plate(50);

        for (int i = 0; i < cat.length; i++) {
            plate.info();
            cat[i].info();
            cat[i].eat(plate);
            cat[i].info();
        }
    }
}


