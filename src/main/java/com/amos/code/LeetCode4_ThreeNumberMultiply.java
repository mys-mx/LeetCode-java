package com.amos.code;

import java.util.Arrays;

/**
 * @Title: LeetCode4_ThreeNumberMultiply
 * @Description: 三个数的乘积：整型数组nums，在数组中找出三个数组组成的最大乘积，并输出这个乘积
 * 1.数组中全部为正数，选出最大的三个正数
 * 2.数组中全部为负数，选出最大的三个负数
 * 3.数组中有正有负，选出两个最小的负数乘上最大的正数，如果只有一个负数就回到 1 的情况中了
 * <p>
 * 综上所属：就只需要考虑两种情况（1）找出三个最大的数，求乘积
 * （2）找出两个最小的数和一个最大的数，求乘积
 * 判断上面两种情况那个结果最大
 */
public class LeetCode4_ThreeNumberMultiply {

    public static void main(String[] args) {

        int[] nums = {-1, -2, 3, 4, 6, -7};

        System.out.println(sort(nums));
        System.out.println(getMaxMin(nums));


    }

    //解法1：先进行排序找出最大的数
    public static int sort(int[] nums) {
        Arrays.sort(nums);//内部使用的是快排，时间复杂度是  NlogN
        int n = nums.length;

        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }

    //解法2：线性扫描
    public static int getMaxMin(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int x : nums) {
            //找出最小的两个数
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }

            //找出最大的三个数
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }

        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
