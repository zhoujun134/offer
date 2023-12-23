package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/4 07:30
 */
public class Test4 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1, 2, 0, 2, 2, 5};
        System.out.println(nNumber(nums, 3));
    }

    public static int singleNumber(int[] nums) {
        int[] bitSums = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % 3;
        }
        return result;
    }
    public static int nNumber(int[] nums, int m) {
        int[] bitSums = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % m;
        }
        return result;
    }
}
