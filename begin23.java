package com.company;

import java.util.Scanner;
public class begin23 {
    void beginE23() {
        Scanner in = new Scanner(System.in);

        System.out.print("A: ");
        double A = in.nextDouble();

        System.out.print("B: ");
        double B = in.nextDouble();

        System.out.print("C: ");
        double C = in.nextDouble();

        A=A+B+C; // 16,13
        B=A-B-C; // 3,65
        C=A-B-C; // 3.65
        A=A-B-C;
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);


    }
}
