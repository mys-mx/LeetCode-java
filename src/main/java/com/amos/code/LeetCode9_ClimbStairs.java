package com.amos.code;

/**
 * @program: leetcode_test
 * @description: 爬楼梯:F(n)=F(n-1)+F(n-2)
 * @create: 2021-08-17 18:18
 */
public class LeetCode9_ClimbStairs {
    public static void main(String[] args) {
        System.out.println(ClimbStairs2(4));

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


    //递归   时间复杂度O(2^n)
    public static int ClimbStairs2(int n) {
        if (n <= 1) return 1;
        return ClimbStairs2(n - 1) + ClimbStairs2(n - 2);
    }


}
