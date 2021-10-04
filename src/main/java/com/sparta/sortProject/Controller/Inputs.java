package com.sparta.sortProject.Controller;

import org.apache.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Inputs {
    public static Logger logger = Logger.getLogger("My Application Logger");
    private final int maxSize=8;
    public int length;
    int [] sortType= new int[maxSize];
    public int index = 0;

    Scanner input = new Scanner(System.in);

    public int getLength() {
        return length;
    }

    public void setLength() {
        System.out.println("Please input the size of the array");
        try {
            this.length = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must input a number!");
            logger.warn("Number not detected in input");
            System.exit(1);
        }
    }

    public int[] getSortType() {
        return sortType;
    }

    public void setSortType() {
        System.out.println("Please select 1 or more of the following sorts and proceed with any character ");
        System.out.println("1.MergeSort 2.BubbleSort 3.QuickSort 4.BinaryTree 5.SelectionSort 6.InsertionSort 7.ArraySort 8.ParallelSort");
        try {
            while (input.hasNext()) {
                if (!input.hasNextInt()) {
                    return;
                }
                int sort = input.nextInt();
                this.sortType[index] = sort;
                index = index + 1;
            }
        } catch (IndexOutOfBoundsException e) {
            logger.warn("The amount of sort options has been exceeded");
            System.err.println("You have exceeded the options!");
        }

    }
}
