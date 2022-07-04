package com.fasttrackit.ExtraMile;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{8, 7, 2, 5, 3, 1, 10, 0, 4, 6};
        int target = 10;

        findPairsOfTwo(array, target);
        System.out.println();
        findPairsOfThree(array, target);

    }


    public static void findPairsOfTwo(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target & array[i] != array[j]) {
                    System.out.println(array[i] + "," + array[j]);
                }
            }
        }
    }

    public static void findPairsOfThree(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int y = j + 1; y < array.length - 2; y++) {
                    if (array[i] + array[j] + array[y] == target && array[i] != array[j] && array[j] != array[y] && array[i] != array[y]) {
                        System.out.println(array[i] + "," + array[j] + "," + array[y]);
                    }
                }

            }
        }

    }
}
