package com.sparta.sortProject.Model;

import java.util.Arrays;
import java.util.Random;

public class SortCreate {
    public int[] arraySort;
    public SortCreate(int l) {
        makeArray(l);

    }
    public int[] getArraySort() {
        return arraySort;
    }


    public void setArraySort(int[] arraySort) {
        this.arraySort = arraySort;
    }



    public void makeArray(int length) {
        int[] arraySort = new int[length];
        for (int i = 0; i < length; i++) {
            Random rnd = new Random();
            arraySort[i] = rnd.nextInt(50);
        }
        System.out.println("-----Unsorted array-----");
        System.out.println(Arrays.toString(arraySort));
        System.out.println("------------------------");
        setArraySort(arraySort);
    }

}
