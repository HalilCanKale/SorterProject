package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;

public class InsertionSort implements Sorter{
    public void sort(int[] testArray){
        int len=testArray.length;
        int j;
        int pointer=0;
        int i;
        for(i=1; i<len;i++){
            pointer=testArray[i];
            j=i-1;
            while (j >= 0 && testArray[j] > pointer)
            {
                testArray[j + 1] = testArray[j];
                j = j - 1;
            }
            testArray[j + 1] = pointer;
        }
    }

}


