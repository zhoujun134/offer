package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/5 23:38
 */
public class Test6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 10};
        int[] result = getSumMethod2(nums, 8);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] getSumMethod1(int[] nums, int k) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];
                if (a + b == k) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return result;
    }

    /**
     * 二分查找法
     */
    public static int[] getSumMethod2(int[] nums, int k) {
        int i = 0, j = nums.length - 1;
        while (i < j && nums[i] + nums[j] != k) {
            if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {i, j};
    }


}
