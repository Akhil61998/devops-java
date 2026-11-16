package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biggest.biggest(sc);

        Factorial.factorial(sc);

        sc.close();
    }
}
