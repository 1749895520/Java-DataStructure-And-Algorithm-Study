package com.algorithm.sort.commonUtil;

public class CommonUtil {
    // 判断 v 是否大于 w
    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    // 交换a数组中，索引和索引处的值
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
