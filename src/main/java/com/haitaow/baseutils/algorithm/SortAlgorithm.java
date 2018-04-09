package com.haitaow.baseutils.algorithm;

/**
 * @Class: SortAlgorithm
 * @Description: 基本常用排序算法
 * @Author: haitaow(haitaow@hpe.com)
 * @Date: 4/8/2018-4:01 PM.
 * @Version 1.0
 */

public class SortAlgorithm {
    /**
     * 选择排序
     *
     * @param isAccending 是否升序
     * @param doubles     待排序数组
     */
    public static void selectSort(double[] doubles, boolean isAccending) {
        if (isAccending) {
            for (int i = 0; i < doubles.length; i++) {
                for (int j = i + 1; j < doubles.length; j++) {
                    double temp = doubles[j];
                    if (doubles[i] > doubles[j]) {
                        doubles[j] = doubles[i];
                        doubles[i] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < doubles.length; i++) {
                for (int j = i + 1; j < doubles.length; j++) {
                    double temp = doubles[j];
                    if (doubles[i] < doubles[j]) {
                        doubles[j] = doubles[i];
                        doubles[i] = temp;
                    }
                }
            }
        }
    }

    /**
     * 冒泡排序
     *
     * @param isAccending 是否升序
     * @param doubles     待排序数组
     */
    public static void bubbleSort(double[] doubles, boolean isAccending) {
        double temp;
        if (isAccending) {
            for (int i = 0; i < doubles.length - 1; i++) {
                for (int j = 0; j < doubles.length - 1 - i; j++) {
                    temp = doubles[j];
                    if (doubles[j] > doubles[j + 1]) {
                        doubles[j] = doubles[j + 1];
                        doubles[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < doubles.length - 1; i++) {
                for (int j = 0; j < doubles.length - 1 - i; j++) {
                    temp = doubles[j];
                    if (doubles[j] < doubles[j + 1]) {
                        doubles[j] = doubles[j + 1];
                        doubles[j + 1] = temp;
                    }
                }
            }
        }
    }
}
