/**
 *
 * Java1. Home Work 2
 * @author Aleksandr Konditerov
 * @version date 26.11.2017
 */

import java.util.Arrays;

public class Java1Lesson2 {

    static int[] arr = {1, 5, 3, 2, 7, 4, 5, 2, 4, 8, 9, 4};
    static int[] arr2 = {98, 5, 3, 2, 7, 4, 5, 2, 4, 8, 9, 4};

    public static void main(String[] args) {
        change0and1();
        System.out.println();
        System.out.println("fillArr");
        fillArr();
        System.out.println();
        System.out.println("doubleIfLess6");
        doubleIfLess6();
        System.out.println();
        System.out.println("fillDiagonal");
        fillDiagonal();
        System.out.println();
        System.out.println("Min: " + findMin(arr) + " Max: " + findMax(arr));
        System.out.println();
        System.out.println(checkBalance(arr));
        System.out.println();
        System.out.println(checkBalance(arr2));
        System.out.println();
        displaceArray(arr, 5);
        System.out.println();
        displaceArray(arr, -5);
    }

    public static void change0and1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("До работы метода change0and1");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println("После работы метода change0and1");
        System.out.println(Arrays.toString(arr));

    }

    public static void fillArr() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void doubleIfLess6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                int a = arr[i];
                arr[i] = a * 2;
            } else {
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr =  new int[5][5];
        for (int i = 0, j = 0, k = 4; i < arr.length; i++, j++, k--) {
            arr[i][j] = 1;
            arr[i][k] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int findMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            } else
                continue;
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                max = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            } else
                continue;
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        int leftSum = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 == 0) {
            while (leftSum < summ / 2) {
                leftSum += arr[a];
                a++;
            }
        }
        return (leftSum == (summ / 2)) ? true : false;
    }

    public static void displaceArray(int[] internalArr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = internalArr[internalArr.length - 1];
                for (int j = internalArr.length - 1; j > 0; j--) {
                    int arrElement = internalArr[j - 1];
                    internalArr[j] = arrElement;
                }
                internalArr[0] = a;
            }
            System.out.println(Arrays.toString(internalArr));

        } else if (n < 0) {
            int modN = Math.abs(n);
            for (int i = 0; i < modN; i++) {
                int a = internalArr[0];
                for (int j = 0; j < internalArr.length - 1; j++) {
                    int arrElement = internalArr[j + 1];
                    internalArr[j] = arrElement;
                }
                internalArr[internalArr.length - 1] = a;
            }
            System.out.println(Arrays.toString(internalArr));
        }
    }
}



