package com.algorithm.math;

/**
 * 欧几里得算法（辗转相除法）
 */
public class Division {
    public static int division(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return division(q, r);
    }
}
