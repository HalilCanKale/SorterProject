package com.sparta.projectTests;

import com.sparta.sortProject.Model.ArraySort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraySortTest {
    private int[]testArr={3,2,34,22,6,36,5,44};
    @Test
    public void arraySort(){
        int [] sortedArray = {3,2,34,22,6,36,5,44};
        Arrays.sort(sortedArray);
        ArraySort aSort= new ArraySort();
        aSort.sort(testArr);
        Assertions.assertArrayEquals(testArr, sortedArray);
    }
}
