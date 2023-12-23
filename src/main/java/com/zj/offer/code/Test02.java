package com.zj.offer.code;

import java.util.Objects;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/3 22:34
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "10"));
    }

    public static String addBinary(String str1, String str2) {
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? str1.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? str2.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            System.out.println(sum);
            result.append(sum);
        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
