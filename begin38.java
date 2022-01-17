package com.company;

import java.util.Scanner;
public class begin38 {
    void beginE38() {
        Scanner in = new Scanner(System.in);

        System.out.println("A: ");
        double a = in.nextDouble();

        System.out.println("B: ");
        double b = in.nextDouble();

        double result = (-1)*b/a;
        System.out.println(result);
    }
}