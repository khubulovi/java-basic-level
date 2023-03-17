package lesson4;
/**
 * Java Core. Basic level. Lesson 4
 *
 * @author Maxo Khubulovi
 * @version dated Mart 17, 2023
 */

import java.util.Random;
import java.util.Scanner;

public class Main {



//    1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
//    2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
//    3. Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//    4. Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int size = 3;
    public static int Dot_to_win = 3;
    public static final char dotsEmpty = '-';
    public static final char Dots_X = 'X';
    public static final char Dots_O = '0';
    public static char[][] map;

    public static void main(String[] args) {
        initialMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(Dots_X)) {
                System.out.println("You won,thats whas a great win");
                break;
            }
            if (isMapFull()) {
                System.out.println("It's a draw");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(Dots_O)) {
                System.out.println("Computer won");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }
        }
        System.out.println("Game is over!");
    }
    public static boolean checkWin(char sumb) {
        if (map[0][0] == sumb && map[0][1] == sumb && map[0][2] == sumb) return true;
        if (map[1][0] == sumb && map[1][1] == sumb && map[1][2] == sumb) return true;
        if (map[2][0] == sumb && map[2][1] == sumb && map[2][2] == sumb) return true;
        if (map[0][0] == sumb && map[1][1] == sumb && map[2][2] == sumb) return true;
        if (map[0][0] == sumb && map[1][0] == sumb && map[2][0] == sumb) return true;
        if (map[0][1] == sumb && map[1][1] == sumb && map[2][1] == sumb) return true;
        if (map[0][2] == sumb && map[1][2] == sumb && map[2][2] == sumb) return true;
        return map[2][0] == sumb && map[1][1] == sumb && map[0][2] == sumb;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dotsEmpty) return false;
            }
        }
        return false;
    }
    public static boolean outFromMap(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return true;
        return map[x][y] == size;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("It's your turn make your choise please");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (outFromMap(x, y));
        if (map[x][y] == dotsEmpty) map[x][y] = Dots_X;
        if (map[x][y] == Dots_O || map[x][y] == Dots_X) {
            System.out.println("You hit the wrong place try again please. ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
    }
    public static void computerTurn() {
        int x, y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (outFromMap(x, y));
        System.out.println("Computer made his disition");
        if (map[x][y] == dotsEmpty) map[x][y] = Dots_O;
        if (map[x][y] == Dots_X || map[x][y] == Dots_O) x = random.nextInt(size);
        y = random.nextInt(size);
    }

    public static void initialMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dotsEmpty;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

