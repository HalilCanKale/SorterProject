package com.sparta.projectTests;

import com.sparta.sortProject.Model.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

    public class InsertionSortTest {
        final int[] testArr = {34,6,4,7,44,5,9};
        @Test
        public void insertionTest(){
            int [] sortedVersion = {34,6,4,7,44,5,9};
            Arrays.sort(sortedVersion);
            InsertionSort Insert= new InsertionSort();
            Insert.sort(testArr);
            Assertions.assertArrayEquals(testArr,sortedVersion);



        }
    }

