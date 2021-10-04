package com.sparta.projectTests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.sparta.sortProject.Model.SortCreate;
import org.junit.jupiter.api.Test;

public class SortCreateTester {
    @Test
    public void sortAppTest(){
        boolean testerVar=true;
        SortCreate sc= new SortCreate(1000);
        int a= sc.arraySort.length;
        for(int i=0; i<a;i++){
            if (sc.arraySort[i] > 50 || sc.arraySort[i] < 0) {
                testerVar = false;
                break;
            }
        }
        assertTrue(testerVar);
        assertEquals(1000, a);
    }
}
