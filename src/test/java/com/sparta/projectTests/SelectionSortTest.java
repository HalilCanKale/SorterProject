package com.sparta.projectTests;

import com.sparta.sortProject.Model.SelectionSort;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    final int[] testArr = {3,6,4,34,12,22,9};
    @Test
    public void selectionTest(){
        int [] sortedVersion = {3,6,4,34,12,22,9};
        Arrays.sort(sortedVersion);
        SelectionSort Select= new SelectionSort();
        Select.sort(testArr);
        Assertions.assertArrayEquals(testArr,sortedVersion);
        }
}

