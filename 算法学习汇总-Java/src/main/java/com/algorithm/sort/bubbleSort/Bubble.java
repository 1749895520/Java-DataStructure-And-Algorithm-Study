package com.algorithm.sort.bubbleSort;

import static com.jToolClass.algorithms.sort.commonUtil.CommonUtil.exch;
import static com.jToolClass.algorithms.sort.commonUtil.CommonUtil.greater;

public class Bubble {
    // 对数组内的元素进行排序
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }
}
