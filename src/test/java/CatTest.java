public class CatTest {

    public static void main(String[] args) {

        Cat []cat = new Cat[5];
        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat("Вася", 40);
        cat[2] = new Cat("Тосик", 31);
        cat[3] = new Cat("Чарли", 40);
        cat[4] = new Cat("Боб", 31);

        Plate plate = new Plate(60);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }
        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
        }
        plate.info();
        plate.increaseFood();

        for (Cat hungryCat : cat) {
            if (!hungryCat.isSatiety()) {
                plate.eatCatWhoIsSatiety(hungryCat);
            }
        }
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
        }
    }
}


