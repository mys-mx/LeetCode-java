package com.amos.code;

import java.util.Arrays;
import java.util.PrimitiveIterator;

/**
 * @program: leetcode_test
 * @description: 爬楼梯:F(n)=F(n-1)+F(n-2)
 * @create: 2021-08-17 18:18
 */
public class LeetCode9_ClimbStairs {
    public static void main(String[] args) {
        System.out.println(ClimbStairs3(4));
        System.out.println(ClimbStairs2(4));
        System.out.println(ClimbStairs1(4));

    }

    //循环 空间复杂度O(1)  时间复杂度O(n)
    public static int ClimbStairs1(int n) {
        if (n <= 1) return 1;
        int per1 = 1;
        int per2 = 1;
        int current = per1;
        for (int i = 2; i <= n; i++) {
            current = per1 + per2;
            per2 = per1;
            per1 = current;
        }
        return current;

    }


    //暴力递归   时间复杂度O(2^n)
    public static int ClimbStairs2(int n) {
        if (n <= 1) return 1;
        return ClimbStairs2(n - 1) + ClimbStairs2(n - 2);
    }

    //去重递归 时间复杂度O(n) 空间复杂度是O(n)
    public static int ClimbStairs3(int n) {
        int[] arr = new int[n + 1];
        PrimitiveIterator.OfInt iterator = Arrays.stream(arr).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return resent(arr, n);
    }

    public static int resent(int[] arr, int n) {
        if (n <= 1) return 1;
        if (arr[n] != 0) {
            return arr[n];
        }
        return resent(arr, n - 1) + resent(arr, n - 2);
    }
}
