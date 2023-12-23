package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/3 23:43
 */
public class Test3 {

    public static void main(String[] args) {
        int[] result = countBitsMethod3(4);
        for (int j : result) {
            System.out.println(j);
        }
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; ++i) {
            int j = i;
            while (j != 0) {
                result[i]++;
                j = j & (j - 1);
            }
        }
        return result;
    }

    public static int[] countBitsMethod2(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }

    public static int[] countBitsMethod3(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
