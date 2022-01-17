package com.company;

import java.util.Scanner;
public class begin27 {
    void beginE27() {
        Scanner in = new Scanner(System.in);

        System.out.print("A: ");
        double a = in.nextDouble();

        System.out.format("A^2 = "+"%.2f",Math.pow(a,2));
        System.out.println();
        System.out.format("A^4 = "+"%.2f",Math.pow(a,4));
        System.out.println();
        System.out.format("A^8 = "+"%.2f",Math.pow(a,8));
    }
}
