package lesson2;

import java.util.Arrays;

/**
 * Java Core. Basic level. Lesson 2
 *
 * @author Maxo Khubulovi
 * @version dated Mart 16, 2023
 */
public class Main {
    public static void main(String[] args) {
        changeArr();
        findArrs();
        searchArr();
        switchArrsInDiagonel();
        findMaxMinArr();
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

