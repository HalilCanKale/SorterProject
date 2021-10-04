package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;

public class BubbleSort implements Sorter{
    @Override
    public void sort(int[] testArr) {
        int a=0;
        int l=testArr.length;
        for(int j=0; j<l;j++) {
            for (int i = 1; i <= (l-1); i++)
                if (testArr[i-1] > testArr[i]) {
                    a = testArr[i -1];
                    testArr[i -1] = testArr[i];
                    testArr[i] = a;
                }
        }
    }
}
