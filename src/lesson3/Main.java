package lesson3;


/**
 * Java Core. Basic level. Lesson 3
 *
 * @author Maxo Khubulovi
 * @version dated Mart 17, 2023
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static Random r = new Random();
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("1 - guessTheNumber / 2 - guessThaWord /3 - exit");
            switch (s.nextInt()) {
                case 1 -> guessTheNumber();
                case 2 -> guessThaWord();
                case 3 -> {
                    return;
                }
            }
        } while (true);
    }

//Task1
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void guessTheNumber() {
        do {
            System.out.println("Let's play guess the number from 0 to 9");
            boolean chekWin = false;
            int[] arr = new int[9];
            int hiddenNumber = r.nextInt(arr.length) + 1;
            for (int i = 0; i < 3; i++) {
                System.out.println("Attemp :" + (i + 1) + " /3 ");
                int userInput = s.nextInt();
                if (userInput == hiddenNumber) {
                    System.out.println("You Won my Friend!");
                    chekWin = true;
                    break;
                }
                System.out.println(userInput > hiddenNumber ? "The number you texted is bigger than Winning number" : "The number you texted is less than Winning number");
            }
            if (!chekWin)
                System.out.println("You lose");
            System.out.println("Do you want to play the game again ?" + "\n" + "If yes press : /1 if no press /0");
        } while (s.nextInt() == 1);
    }

    //Task2
//            2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//            apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие буквы


    public static void guessThaWord() {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Let's play my friend.");
        String hiddenword = words[r.nextInt(words.length)];

        do {
            for (int i = 0; i < 4; i++) {
                if (i == 3) System.out.println("You lose, the hidden word was : " + hiddenword);
                if (i == 3) break;
                System.out.println("Type the hidden word to win :" + "\n" + "Attemp : " + i + "/3");
                String userInput = s.nextLine();
                if (userInput.equals("")) break;
                else if (userInput.equals(hiddenword)) {
                    System.out.println("You won my friend");
                    hiddenword = words[r.nextInt(words.length)];
                    break;
                }
                char[] tempBuffer = new char[hiddenword.length()];
                Arrays.fill(tempBuffer, '#');
                for (int j = 0; j < hiddenword.length(); j++) {
                    if (j >= userInput.length()) break;
                    tempBuffer[j] = hiddenword.charAt(j) != userInput.charAt(j) ? '#' : userInput.charAt(j);
                }
                System.out.println(String.valueOf(tempBuffer) + "##########");
            }
        } while (true);
    }
}






