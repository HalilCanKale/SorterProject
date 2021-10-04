package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;

public class MergeSort implements Sorter{
    @Override
    public void sort(int[] testArr) {
        merge(testArr,testArr.length);
    }

    public static void merge(int[] testArr, int n){
        if (n<2){
            return;
        }
        int mid = n/2;
        int [] l=new int [mid];
        int [] r=new int [n-mid];
        for (int i=0; i<mid; i++){
            l[i]=testArr[i];
        }
        for (int i=mid;i<n;i++){
            r[i-mid]=testArr[i];
        }
        merge(l, mid);
        merge(r, n - mid);
        compare(testArr, l, r, mid, n - mid);
    }

    public static void compare(int[] testArr, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                testArr[k++] = l[i++];
            }
            else {
                testArr[k++] = r[j++];
            }
        }
        while (i < left) {
            testArr[k++] = l[i++];
        }
        while (j < right) {
            testArr[k++] = r[j++];
        }
    }

}
