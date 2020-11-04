package com.andersen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] x = {22,1,-5,16,28,5,13,7,-10,-11,55,-23};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(x);
        System.out.println(Arrays.toString(x));
    }
}
