package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class ParallelSort implements Sorter {
    public void sort(int[]t){
        Arrays.parallelSort(t);
    }
}
