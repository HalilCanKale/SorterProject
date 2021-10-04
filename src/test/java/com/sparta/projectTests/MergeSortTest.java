package com.sparta.projectTests;

import com.sparta.sortProject.Model.InsertionSort;
import com.sparta.sortProject.Model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
    final int[] testArr = {34,6,4,2,44,5,9};
    @Test
    public void mergeTest(){
        int [] sortedVersion = {34,6,4,2,44,5,9};
        Arrays.sort(sortedVersion);
        MergeSort merge = new MergeSort();
        merge.sort(testArr);
        Assertions.assertArrayEquals(testArr,sortedVersion);



    }
}

