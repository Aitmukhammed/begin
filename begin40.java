package com.company;

import java.util.Scanner;
public class begin40 {
    void beginE40() {
        Scanner in = new Scanner(System.in);

        System.out.println("A1: ");
        double a1 = in.nextDouble();

        System.out.println("B1: ");
        double b1 = in.nextDouble();

        System.out.println("C1: ");
        double c1 = in.nextDouble();

        System.out.println("A2: ");
        double a2 = in.nextDouble();

        System.out.println("B2: ");
        double b2 = in.nextDouble();

        System.out.println("C2: ");
        double c2 = in.nextDouble();

        double d = a1*b2-a2*b1;
        double x = (c1*b2-c2*b1)/d;
        double y = (a1*c2 - a2*c1)/d;

        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
}
