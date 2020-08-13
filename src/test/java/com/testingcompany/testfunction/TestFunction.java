package com.testingcompany.testfunction;

import org.junit.Test;

import java.util.HashMap;

public class TestFunction {
    public void arraySimilarity(int[] array1, int[] array2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        System.out.print("1st Array:");
        for (int i: array1) {
            System.out.print(" " + i);
        }

        System.out.println("");

        System.out.print("2nd Array:");
        for (int i: array2) {
            System.out.print(" " + i);
        }

        System.out.println("");

        System.out.print("Same entries:");

        if (array1.length > array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (!hashMap.containsKey(array1[i])) {
                    hashMap.put(array1[i], i);
                }
            }

            for (int i : array2) {
                if (hashMap.containsKey(i)) {
                    System.out.print(" " + array1[hashMap.get(i)]);
                }
            }

        }
        else {
            for (int i = 0; i < array2.length; i++) {
                if (!hashMap.containsKey(array2[i])) {
                    hashMap.put(array2[i], i);
                }
            }

            for (int i : array1) {
                if (hashMap.containsKey(i)) {
                    System.out.print(" " + array2[hashMap.get(i)]);
                }
            }

        }
        System.out.println("");
    }

    @Test
    public void arrayTesting() {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        int[] array2 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

        arraySimilarity(array1, array2);
    }
}
