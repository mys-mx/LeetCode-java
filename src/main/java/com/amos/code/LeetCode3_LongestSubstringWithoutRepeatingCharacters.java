package com.amos.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: LeetCode3_LongestSubstringWithoutRepeatingCharacters
 * @Description: 无重复字符的最长子串--->滑动窗口
 *
 */
public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String word = "abcabcdb";
        char[] chars = word.toCharArray();
        List<Character> list = new ArrayList<>();

        int maxLength = 0, j = 0;

        for (int i = 0; i < chars.length; i++) {
            if (!list.contains(chars[i])) {
                list.add(chars[i]);
                maxLength = Math.max(maxLength, list.size());
            } else {
                while (list.contains(chars[i])) {

                    list.remove(new Character(chars[j]));
                    j++;
                }
                list.add(chars[i]);
            }


        }


        System.out.println(maxLength);
    }

}
