package com.sparta.sortProject.View;

import com.sparta.sortProject.Model.SortCreate;
import com.sparta.sortProject.Model.SortOption;
import com.sparta.sortProject.Model.Sorter;
import com.sparta.sortProject.Model.Timer;
import com.sparta.sortProject.Controller.Inputs;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Arrays;

public class SortApp {
    public static Logger logger = Logger.getLogger("My Application Logger");
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Timer main= new Timer();
        Inputs l = new Inputs();
        l.setLength();
        l.setSortType();
        int length=l.getLength();
        int[] type=l.getSortType();
        SortCreate unsorted= new SortCreate(length);
        int [] arr=unsorted.getArraySort();
        SortOption sorted= new SortOption();
        int [] sor= arr;
        Arrays.sort(sor);
        try {
            System.out.println("------Sorted Array------");
            System.out.println(Arrays.toString(sor));
            System.out.println("------------------------");
            for (int a = 0; a < type.length; a++) {
                if (type[a] == 0) {
                    return;
                } else {
                    Sorter s = sorted.Choice(type[a]);
                    main.startTimer();
                    s.sort(arr);
                    main.stopTimer();
                    System.out.println(sorted.st + " : " + main.getTime() + " ns");
                }
            }
        }catch (NullPointerException e){
            System.out.println("You have entered an incorrect sort option!");
            logger.warn("Incorrect sort option entered!");
        }
    }
}


