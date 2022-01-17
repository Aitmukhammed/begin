package com.company;

import java.util.Scanner;
public class begin37 {
    void beginE37() {
        Scanner in = new Scanner(System.in);

        System.out.print("V1: ");
        double v1 = in.nextDouble();

        System.out.print("V2: ");
        double v2 = in.nextDouble();

        System.out.print("S: ");
        double s = in.nextDouble();

        System.out.print("T: ");
        double t = in.nextDouble();

        double result = ((v1 + v2) * t) - s;
        System.out.println("Общий путь: "+result);
    }
}
