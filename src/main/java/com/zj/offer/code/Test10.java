package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/7 00:26
 */
public class Test10 {
    public static void main(String[] args) {
        int k = 100;
        int[] nums = {10, 5, 2, 6};
        int result = numSubArrayProductLessThanK(k, nums);
        System.out.println(result);
    }

    public static int numSubArrayProductLessThanK(int k, int[] nums) {
        long product = 1;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product /= nums[left++];
            }
            count += right >= left ? right - left + 1 : 0;
        }
        return count;
    }
}
