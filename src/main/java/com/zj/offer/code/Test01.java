package com.zj.offer.code;

/**
 * 作者: zhoujun134
 * 时间: 2023/12/2 23:33
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(method2(-12, 2));
        System.out.println(method1(-12, 2));
    }

    /**
     * 0x80000000 is -2<sup>31</sup>
     * @param dividend 被除数
     * @param divisor 除数
     */
    public static int method2(int dividend, int divisor) {
        if (dividend == 0x80000000 && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int negative = 2;
        if (dividend > 0) {
            negative--;
            dividend = -dividend;
        }
        if (divisor > 0) {
            negative--;
            divisor = -divisor;
        }
        int result = divideCore(dividend, divisor);
        return negative == 1 ? -result : result;
    }

    /**
     * 0xc0000000 is -2<sup>30</sup>.
     */
    private static int divideCore(int dividend, int divisor) {
        int result = 0;
        while (dividend <= divisor) {
            int value = divisor;
            int quotient = 1;
            while (value >= 0xc0000000 && dividend <= value + value) {
                quotient += quotient;
                value += value;
            }
            result += quotient;
            dividend -= value;
        }
        return result;
    }

    public static int method1(int dividend, int divisor){
        int a = dividend;
        int b = divisor;
        if (dividend < 0) {
            a = -dividend;
        }
        if (divisor < 0 ) {
            b = -divisor;
        }
        int result = 0;
        while (a - b >= 0) {
            result += 1;
            a -= b;
        }
        if ((dividend < 0 && divisor > 0 )
                || (divisor < 0 && dividend > 0 )) {
            result = -result;
        }

        return result;
    }
}
