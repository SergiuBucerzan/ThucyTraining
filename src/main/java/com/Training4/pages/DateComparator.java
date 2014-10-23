package com.Training4.pages;

import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<Date> {
    public int compare(Date a, Date b) {
        return b.compareTo(a);
    }
}