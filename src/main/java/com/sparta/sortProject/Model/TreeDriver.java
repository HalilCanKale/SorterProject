package com.sparta.sortProject.Model;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class TreeDriver implements Sorter {

    private BinaryTree theTree = new BinaryTree();
    @Override
    public void sort(int[] testArray) {
        BinaryTree theTree = new BinaryTree();
        for (int nextValue : testArray) {
            theTree.adder(nextValue);
        }
        print();
    }

    public void print(){
        System.out.println(theTree);
    }

}