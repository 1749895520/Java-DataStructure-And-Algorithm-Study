package com.algorithm.math;

public final class JStats {

    private JStats() {

    }

    /**
     * 返回指定数组的最大值
     *
     * @param a 双浮点型数组
     * @return 数组最大值
     */
    public static double max(double[] a) {
        validateNotNull(a);

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 返回指定数组的最大值
     *
     * @param a  双浮点型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组最大值
     */
    public static double max(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        double max = Double.NEGATIVE_INFINITY;
        for (int i = lo; i < hi; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 返回指定数组的最大值
     *
     * @param a 整形数组
     * @return 数组最大值
     */
    public static int max(int[] a) {
        validateNotNull(a);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 返回指定数组的最大值
     *
     * @param a  整形数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组最大值
     */
    public static int max(int[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int max = Integer.MIN_VALUE;
        for (int i = lo; i < hi; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 返回指定数组的最小值
     *
     * @param a 双浮点型数组
     * @return 数组最小值
     */
    public static double min(double[] a) {
        validateNotNull(a);

        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    /**
     * 返回指定数组的最小值
     *
     * @param a  双浮点型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组最小值
     */
    public static double min(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        double min = Double.POSITIVE_INFINITY;
        for (int i = lo; i < hi; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    /**
     * 返回指定数组的最小值
     *
     * @param a 整形数组
     * @return 数组最小值
     */
    public static int min(int[] a) {
        validateNotNull(a);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    /**
     * 返回指定数组的最小值
     *
     * @param a  整形数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组最小值
     */
    public static int min(int[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int min = Integer.MAX_VALUE;
        for (int i = lo; i < hi; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    /**
     * 返回指定数组中的平均值
     *
     * @param a 双浮点型数组
     * @return 平均值
     */
    public static double mean(double[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double sum = sum(a);
        return sum / a.length;
    }

    /**
     * 返回指定数组中的平均值
     *
     * @param a  双浮点型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 平均值
     */
    public static double mean(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int length = hi - lo;
        if (length == 0) return Double.NaN;

        double sum = sum(a, lo, hi);
        return sum / length;
    }

    /**
     * 返回指定数组中的平均值
     *
     * @param a 整形数组
     * @return 平均值
     */
    public static double mean(int[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        int sum = sum(a);
        return 1.0 * sum / a.length;
    }

    /**
     * 返回指定数组中的平均值
     *
     * @param a  双浮点型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 平均值
     */
    public static double mean(int[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int length = hi - lo;
        if (length == 0) return Double.NaN;

        int sum = sum(a, lo, hi);
        return sum * 1.0 / length;
    }

    /**
     * 返回指定数组中的样本方差。
     *
     * @param a 双浮点型数组
     * @return 样本方差
     */
    public static double var(double[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
    }

    /**
     * 返回指定数组中的样本方差。
     *
     * @param a  双浮点型整数
     * @param lo 左边界
     * @param hi 右边界
     * @return 样本方差
     */
    public static double var(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int length = hi - lo;
        if (length == 0) return Double.NaN;

        double avg = mean(a, lo, hi);
        double sum = 0.0;
        for (int i = lo; i < hi; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (length - 1);
    }

    /**
     * 返回指定数组中的样本方差。
     *
     * @param a 整形数组
     * @return 样本方差
     */
    public static double var(int[] a) {
        validateNotNull(a);
        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
    }

    /**
     * 返回指定子数组中的总体方差。
     *
     * @param a 数组
     * @return 总体方差
     */
    public static double varp(double[] a) {
        validateNotNull(a);
        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / a.length;
    }

    /**
     * 返回指定子数组中的总体方差。
     *
     * @param a  数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 总体方差
     */
    public static double varp(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int length = hi - lo;
        if (length == 0) return Double.NaN;

        double avg = mean(a, lo, hi);
        double sum = 0.0;
        for (int i = lo; i < hi; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / length;
    }

    /**
     * 返回指定数组中所有值的总和。
     *
     * @param a 双浮点型数组
     * @return 数组总和
     */
    private static double sum(double[] a) {
        validateNotNull(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * 返回指定子数组中的样本标准差。
     *
     * @param a 数组
     * @return 样本标准差
     */
    public static double stddev(double[] a) {
        validateNotNull(a);
        return Math.sqrt(var(a));
    }

    /**
     * 返回指定子数组中的样本标准差。
     *
     * @param a 数组
     * @return 样本标准差
     */
    public static double stddev(int[] a) {
        validateNotNull(a);
        return Math.sqrt(var(a));
    }

    /**
     * 返回指定子数组中的样本标准差。
     *
     * @param a  数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 样本标准差
     */
    public static double stddev(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        return Math.sqrt(var(a, lo, hi));
    }

    /**
     * 返回指定数组中的总体标准差。
     *
     * @param a 数组
     * @return 总体标准差
     */
    public static double stddevp(double[] a) {
        validateNotNull(a);
        return Math.sqrt(varp(a));
    }

    /**
     * 返回指定数组中的总体标准差。
     *
     * @param a  数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 总体标准差
     */
    public static double stddevp(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        return Math.sqrt(varp(a, lo, hi));
    }

    /**
     * 返回指定数组中所有值的总和。
     *
     * @param a  双浮点型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组总和
     */
    private static double sum(double[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        double sum = 0.0;
        for (int i = lo; i < hi; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * 返回指定数组中所有值的总和。
     *
     * @param a 整形数组
     * @return 数组总和
     */
    private static int sum(int[] a) {
        validateNotNull(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * 返回指定数组中所有值的总和。
     *
     * @param a  整型数组
     * @param lo 左边界
     * @param hi 右边界
     * @return 数组总和
     */
    private static int sum(int[] a, int lo, int hi) {
        validateNotNull(a);
        validateSubarrayIndices(lo, hi, a.length);

        int sum = 0;
        for (int i = lo; i < hi; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * 如果 x 为 null，则抛出 IllegalArgumentException
     * x 为 int[] 类型或者 double[] 类型
     *
     * @param x 数组对象
     */
    private static void validateNotNull(Object x) {
        if (x == null)
            throw new IllegalArgumentException("参数为空");
    }

    /**
     * 抛出异常，除非 0 <= log <= hi <= length
     *
     * @param lo     左边界
     * @param hi     右边界
     * @param length 数组长度
     */
    private static void validateSubarrayIndices(int lo, int hi, int length) {
        if (lo < 0 || hi > length || lo > hi)
            throw new IllegalArgumentException("数组索引超出范围: [" + lo + ", " + hi + ")");
    }

}
