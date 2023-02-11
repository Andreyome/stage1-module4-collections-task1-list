package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int result =0;
        if (first*first>second*second) {
            return 0;
        }
        if (second*second > first*first) {
            return  -1;
        }
        if (second*second== first*first){
            if ( second>first) {
                return -1;
            }
        }
        return 1;
    }
}
