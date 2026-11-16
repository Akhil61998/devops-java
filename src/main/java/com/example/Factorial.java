package com.example;

import java.util.Scanner;

public class Factorial {

    public static void factorial(Scanner sc) {

        System.out.println("Enter an integer:");

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial of negative numbers doesn't exist.");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }
}
