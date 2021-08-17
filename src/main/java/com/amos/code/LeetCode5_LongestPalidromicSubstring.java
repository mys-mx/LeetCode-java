package com.amos.code;

/**
 * @Title: LeetCode5_LongestPalidromicSubstring
 * @Description: 最长的回文子字符串
 * 解题思路：
 * 1.如果字符串长度小于2，直接返回源字符串
 * 2.定义两个变量，一个start存储当前找到的最大回文字符串的起始位置，另一个maxLength记录字符串的长度（终止位置就是start+maxLength）
 * 3.创建一个helper function，判断左边和右边是否越界，同时最左边的字符是否等于最右边的字符。
 * 如果以上三个条件都满足，则判断是否需要更新回文字符串的最大长度及最大字符串的起始位置。然后将left--，right++继续判断，直到不满足三个条件为止
 * 4.遍历字符串，每个位置调用helper function 两遍，第一遍检查i-1，i+1，第二遍检查i ，i+1
 *
 * 时间复杂度为O(n^2)
 */
public class LeetCode5_LongestPalidromicSubstring {

    public static void main(String[] args) {

        System.out.println(getPalidromicSubstring("abcbc"));

    }

    public static String getPalidromicSubstring(String str) {

        if (str.length() < 2) {
            return str;
        }
        int start = 0;
        int maxLength = 1;


        for (int i = 0; i < str.length(); i++) {

            int left = i;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
        }
        return str.substring(start, start + maxLength);
    }

}
