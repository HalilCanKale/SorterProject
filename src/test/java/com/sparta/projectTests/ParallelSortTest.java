package com.sparta.projectTests;

import com.sparta.sortProject.Model.ParallelSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ParallelSortTest {
    private final int []testArr={34,50,23,4,49,37,9};
    @Test
    public void parallelSort(){
        int [] sortedArray={34,50,23,4,49,37,9};
        Arrays.sort(sortedArray);
        ParallelSort paraSort= new ParallelSort();
        paraSort.sort(testArr);
        Assertions.assertArrayEquals(testArr, sortedArray);
    }
}
