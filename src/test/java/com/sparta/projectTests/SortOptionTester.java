package com.sparta.projectTests;

import com.sparta.sortProject.Model.BubbleSort;
import com.sparta.sortProject.Model.SortOption;
import com.sparta.sortProject.Model.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortOptionTester {
    private final String[] sortTypes={"MergeSort", "BubbleSort", "QuickSort","BinaryTree", "SelectionSort", "InsertionSort", "ArraySort", "ParallelSort"};
    private final int [] sortNums={1,2,3,4,5,6,7,8};

    @Test
    public void SortOption(){
        SortOption sorted= new SortOption();
        for(int i=1; i<sortNums.length;i++){
            sorted.Choice(sortNums[i]);
            System.out.println(sortTypes[i]);
            System.out.println(sorted.st);
            Assertions.assertEquals(sorted.st, sortTypes[i]);
        }

    }
}
