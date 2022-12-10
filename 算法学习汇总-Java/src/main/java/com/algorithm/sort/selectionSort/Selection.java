package com.algorithm.sort.selectionSort;

import com.jToolClass.algorithms.sort.commonUtil.CommonUtil;

import static com.jToolClass.algorithms.sort.commonUtil.CommonUtil.greater;

public class Selection {
    /*
        对数组 a 中的元素进行排序
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
            CommonUtil.exch(a, i, minIndex);
        }
    }
}
