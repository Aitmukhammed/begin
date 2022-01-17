package com.company;

import java.util.Scanner;
public class begin17 {
    void beginE17(){
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        double a = in.nextDouble();

        System.out.print("B: ");
        double b = in.nextDouble();

        System.out.print("C: ");
        double c = in.nextDouble();

        double AC = Math.abs(a-c);
        double BC = Math.abs(b-c);

        double result = AC + BC;
        System.out.format("Result:"+"%.2f",result);
    }
}
