package lesson2;

import java.util.Arrays;

/**
 * Java Core. Basic level. Lesson 2
 *
 * @author Maxo Khubulovi
 * @version dated Mart 16, 2023
 */
public class Main {


//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static void main(String[] args) {
       //Task1
        changeArr();
        //Task2
        findArrs();
        //Task3
        searchArr();
        //Task4
        switchArrsInDiagonel();
        //Task5
        findMaxMinArr();
        //Task6
        variableLen(3,5);
    }


    public static void changeArr() {
        int[] arr = {0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        System.out.println(Arrays.toString(arr));
    }

    public static void findArrs() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i * 3;
        System.out.println(Arrays.toString(arr));
    }

    public static void searchArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6) arr[i] *= 2;
        System.out.println(Arrays.toString(arr));
    }


    public static void switchArrsInDiagonel() {
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) arr[i][j] = 1;
                if (i + j + 1 == arr.length) arr[i][j] = 1;
                {
                    System.out.print(arr[i][j] + "");
                }
            }
            System.out.println();
        }
    }

    public static void findMaxMinArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++)
            if (max < arr[i]) max = arr[i];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i]) min = arr[i];

        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void variableLen(int len, int initiVariable) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initiVariable;
            System.out.println("[" + i + "]" + arr[i] );
        }
    }
}

