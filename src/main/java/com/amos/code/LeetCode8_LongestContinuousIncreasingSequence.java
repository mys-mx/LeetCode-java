package com.amos.code;

/**
 * @Title: LeetCode8_LongestContinuousIncreasingSequence
 * @Description: 给定一个未经排序的整数数组，找到最长且连续递增的子序列，并返回其长度--->贪心算法
 * 从数组的下标为0的位置开始，
 * 依次往后数当后一个数（i）大于等于前一个数(j)的时候将开始位置变为i，
 * 将走过的长度记录到max中
 * 最后返回max
 */
public class LeetCode8_LongestContinuousIncreasingSequence {

    public static void main(String[] args) {
        int length = findLength(new int[]{1, 2, 3, 2, 3, 4, 3, 4, 5, 6});
        System.out.println(length);
    }

    private static int findLength(int[] ints) {

        int start = 0, max = 0;

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] <= ints[i - 1]) {
                start = i;
            }
            max = Math.max(max, i - start + 1);
        }

        return max;
    }

}
