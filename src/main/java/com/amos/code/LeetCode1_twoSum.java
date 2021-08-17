package com.amos.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: LeetCode1_twoSum
 * @Description: 给一个数组，求两数之和等于目标数据
 */
public class LeetCode1_twoSum {


    /**
     * 解体思路：
     * 1.创建一个map
     * 2.for循环遍历nums数组
     * 3.用target减去nums[i]
     * 以计算那个数能根当前的数字相加得到target
     * 4.检查map里面有没有这个数，
     * 如果有则返回结果
     * 如果没有则把nums[i]当作key
     * i作为value放入map中
     */
    public static void main(String[] args) {

        int[] nums = {2, 3, 11, 7};
        Map<Integer, Integer> map = new HashMap<>();

        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                System.out.println("第" + map.get(target - nums[i]) + "个数,即" + (target - nums[i]) + "和" + nums[i] + "的结果是" + target);
            }
        }

    }
}
