package com.sparta.sortProject.Model;

import com.sun.source.tree.Tree;
import org.apache.log4j.Logger;

public class SortOption{
    public static Logger logger = Logger.getLogger("My Application Logger");
    public String st;
    public Sorter Choice(int type) {
        Sorter sorted = null;
        switch (type) {
            case 1:
                sorted = new MergeSort();
                logger.info("MergeSort selected");
                st="MergeSort";
                break;
            case 2:
                sorted = new BubbleSort();
                st="BubbleSort";
                logger.info("BubbleSort selected");
                break;
            case 3:
                sorted = new QuickSort();
                st="QuickSort";
                logger.info("QuickSort selected");
                break;
            case 4:
                sorted = new TreeDriver();
                st="BinaryTree";
                logger.info("BinaryTreeSort selected");
                break;
            case 5:
                sorted= new SelectionSort();
                st="SelectionSort";
                logger.info("SelectionSort selected");
                break;
            case 6:
                sorted= new InsertionSort();
                st="InsertionSort";
                logger.info("InsertionSort selected");
                break;
            case 7:
                sorted= new ArraySort();
                st="ArraySort";
                logger.info("ArraySort selected");
                break;
            case 8:
                sorted= new ParallelSort();
                st="ParallelSort";
                logger.info("ParallelSort selected");
                break;
            default:
                sorted=null;
        }
        return sorted;
    }

}