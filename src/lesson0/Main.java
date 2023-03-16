package lesson0;



public class Main {
//    1.Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
//    2.Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//            Orange
//            Banana
//            Apple
//
//   3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
//   4.Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
//   5.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
//   6.Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
//
//Task1,Task6
    public static void main(String[] args) {
        //Task2
    printThreeWords();
    //Task3
    checkSumSign(4, 5);
    //Task4
    printColor(-343);
    //Task5
    compareNumbers(-1, 2);
}

    public static void printThreeWords() {
        System.out.println("Orange\nApple\nBanana");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Sum is possitive");
        } else {
            System.out.println("Sum is't posstivie");
        }
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Red");
        }
        if (value > 0 && value < 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

