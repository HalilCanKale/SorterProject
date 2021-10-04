package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Arrays;

public class ArraySort implements Sorter{
    public void sort(int[] t){
        Arrays.sort(t);
    }
}
