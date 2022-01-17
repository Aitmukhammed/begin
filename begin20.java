package com.company;

import java.util.Scanner;
public class begin20 {
    void beginE20() {
        Scanner in = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = in.nextDouble();

        System.out.print("y1: ");
        double y1 = in.nextDouble();

        System.out.print("x2: ");
        double x2 = in.nextDouble();

        System.out.print("y2: ");
        double y2 = in.nextDouble();

        double result = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.format("Result: "+"%.2f",result);
    }
}
