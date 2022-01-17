package com.company;
import java.util.Scanner;
public class begin16{
    void beginE16() {
        Scanner in = new Scanner(System.in);

        System.out.print("X1: ");
        double x1 = in.nextDouble();

        System.out.print("V2: ");
        double x2 = in.nextDouble();

        double result = Math.abs(x2 - x1);
        System.out.format("Result: "+"%.2f",result);

    }
}
