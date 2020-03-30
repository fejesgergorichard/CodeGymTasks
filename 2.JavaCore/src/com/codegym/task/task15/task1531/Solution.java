package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.lang.String;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger factorialNumber = new BigInteger("1");

        if (n < 0) {
            return Integer.toString(0);
        }

        else if (n == 0) {
            return Integer.toString(1);
        }


        else {
            for (int i = 1; i <= n; i++) {
                factorialNumber = factorialNumber.multiply((BigInteger.valueOf(i)));
            }
        }
        return String.valueOf(factorialNumber);
    }
}
