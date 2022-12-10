package com.algorithm.sort.insertionSort;

import com.jToolClass.algorithms.sort.commonUtil.CommonUtil;

public class Insertion {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (CommonUtil.greater(a[j - 1], a[j])) {
                    CommonUtil.exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }
}
