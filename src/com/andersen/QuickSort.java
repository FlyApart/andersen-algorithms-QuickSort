package com.andersen;

public class QuickSort {

    public void sort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int start = low;
        int finish = high;
        int mid = start + (finish - start) / 2;

        while (start < finish) {

            while (start < mid && (array[start] <= array[mid])) {
                start++;
            }
            while (finish > mid && (array[mid] <= array[finish])) {
                finish--;
            }
            if (start < finish) {
                int ch = array[start];
                array[start] = array[finish];
                array[finish] = ch;
            }
            if (start == mid)
                mid = finish;
            else if (finish == mid)
                mid = start;
        }
        quickSort(array, low, mid);
        quickSort(array, mid+1, high);
    }
}