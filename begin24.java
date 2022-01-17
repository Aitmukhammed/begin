package com.company;

import java.util.Scanner;
public class begin24 {
    void beginE24() {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        double A = in.nextDouble();

        System.out.print("B: ");
        double B = in.nextDouble();

        System.out.print("C: ");
        double C = in.nextDouble();

        A=A+B+C;
        B=A-B-C;
        C=A-B-C;


        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
    }
}
