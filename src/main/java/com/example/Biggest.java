package com.example;

import java.util.Scanner;

public class Biggest {

    public static void biggest(Scanner sc) {

        System.out.println("Enter three numbers:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest number: " + largest);
    }
}
