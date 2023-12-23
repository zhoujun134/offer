package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/7 00:13
 */
public class Test8 {
    public static void main(String[] args) {
        int k = 7;
        int[] nums = {5, 1, 4, 3};
        int minSubArrayLen = minSubArrayLen(k, nums);
        System.out.println(minSubArrayLen);
    }

    public static int minSubArrayLen(int k, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (left <= right && sum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
