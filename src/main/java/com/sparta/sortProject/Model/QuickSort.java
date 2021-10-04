package com.sparta.sortProject.Model;

public class QuickSort implements Sorter {
    @Override
    public void sort(int[] testArr) {

        quick(testArr, 0, testArr.length-1
        );
    }

    public void quick(int[] testArr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(testArr, begin, end); //Getting
            quick(testArr, begin, partitionIndex-1);
            quick(testArr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
