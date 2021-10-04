package com.sparta.sortProject.Model;

public class SelectionSort implements Sorter{
    public void sort(int[] testArray) {
        for (int i = 0; i < testArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < testArray.length; j++) {
                if (testArray[min] > testArray[j]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = testArray[i];
                testArray[i] = testArray[min];
                testArray[min] = temp;
            }
        }
    }

}
