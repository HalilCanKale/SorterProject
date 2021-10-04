package com.sparta.projectTests;

import com.sparta.sortProject.Model.BubbleSort;
import com.sparta.sortProject.Model.SortOption;
import com.sparta.sortProject.Model.Sorter;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private final int[] testArr = {34,6,4,7,44,5,9};
    @Test
    public void bubbleTest(){
        int [] sortedVersion = {34,6,4,7,44,5,9};
        Arrays.sort(sortedVersion);
        BubbleSort Bubble= new BubbleSort();
        Bubble.sort(testArr);
        Assertions.assertArrayEquals(testArr,sortedVersion);
    }
}
