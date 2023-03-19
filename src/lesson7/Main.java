package lesson7;

/**
 * Java Core. Basic level. Lesson 5
 *
 * @author Maxo Khubulovi
 * @version dated Mart 19, 2023
 */

public class Main {

        public static void main(String[] args) {
        Plate plate=new Plate(45);
        Cat [] cats=new Cat[]{new Cat("Borya",20,true),new Cat("Angela",30,true),new Cat("VAsya",45,true)};

        for (Cat cat:cats
        ) {cat.eat(plate);
            plate.addFood(40);
            plate.info();
            cat.catInfo();
        }
    }
}
