package lesson1;

/**
 * Java Core. Basic level. Lesson 1
 *
 * @author Maxo Khubulovi
 * @version dated Mart 15, 2023
 */
public class Main {
    public static void main(String[] args) {
        // task №2
        createVariable();

        // task №3
        System.out.println(resultExpression(11, 22, 33, 44) + "\n");

        // task №4
        System.out.println(expressionCheck(11, 19) + "\n");

        // task №5
        checkPositiveNegative(22);

        // task №6
        System.out.println(checkNegative(-2) + "\n");

        // task №7
        printHello("Nika");

        // task №8
        System.out.println(checkLeapYear(2000));
    }

    /**
     * 2. Создать и проинициализировать переменные типов
     * byte, short, int, long, float, double, char, boolean, string
     */
    public static void createVariable() {
        // Примитивные.
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        float f = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;
        char c = Character.MAX_VALUE;
        boolean bool = Boolean.TRUE;
        // Ссылочные (объектные).
        String str = "Hello, World!";
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
     * результат, где a, b, c, d – входные параметры этого метода
     */
    public static float resultExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их
     * сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false
     */
    public static boolean expressionCheck(int a, int b) {
        return a >= 10 && b <= 20;
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали,
     * или отрицательное. Замечание: ноль считаем положительным числом
     */
    public static void checkPositiveNegative(int a) {
        System.out.println(a >= 0 ? "Positive\n" : "Negative\n");
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали,
     * или отрицательное. Замечание: ноль считаем положительным числом
     */
    public static boolean checkNegative(int a) {
        return a < 0;
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     * метод должен вернуть true, если число отрицательное
     */
    public static void printHello(String name) {
        System.out.println("Hello, " + name + "!\n");
    }

    /**
     * 8* Написать метод, который определяет является ли год високосным, и
     * выводит сообщение в консоль. Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}