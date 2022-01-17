package com.company;

import java.util.Scanner;
public class begin26 {
    void beginE26() {
        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        double x = in.nextDouble();

        double y = 4*Math.pow(x-3,6) - 7*Math.pow(x-3,3)+2;
        System.out.format("Y: "+"%.2f",y);
    }
}
