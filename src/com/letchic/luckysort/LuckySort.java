package com.letchic.luckysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckySort {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        List<String> sorted = new ArrayList<>(strings);
        boolean isSorted = false;
        while(!isSorted){
            Collections.shuffle(strings);
            Collections.sort(sorted);
            if(strings.equals(sorted)) isSorted = true;
            strings.forEach(System.out::println);
            System.out.println();
        }
    }
}