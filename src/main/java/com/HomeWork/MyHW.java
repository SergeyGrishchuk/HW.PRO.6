package com.HomeWork;

import java.util.Arrays;

public class MyHW {
    public static void main(String[] args) {
    }
    public static int[] arraySelectAfter4(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 4) {
                return Arrays.copyOfRange(arr, i +1, arr.length);
            }
        }
        throw new RuntimeException("В массиве нет 4");
    }

    public static boolean array1and4(int[] arr) {
        boolean no1 = false;
        boolean no4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1){
                no1 = true;
            }
            if (arr[i] == 4){
                no4 = true;
            }
        }
        return no1 && no4;
    }
}
