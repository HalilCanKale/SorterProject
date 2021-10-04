package com.sparta.projectTests;

import com.sparta.sortProject.Model.ArraySort;
import com.sparta.sortProject.Model.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest {
    private int[]testArr={3,2,34,22,6,36,5,44};
    @Test
    public void quickSort(){
        int [] sortedArray = {3,2,34,22,6,36,5,44};
        Arrays.sort(sortedArray);
        QuickSort quick= new QuickSort();
        quick.sort(testArr);
        Assertions.assertArrayEquals(testArr, sortedArray);
    }
}
