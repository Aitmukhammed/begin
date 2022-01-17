package com.company;

import java.util.Scanner;
public class begin25 {
    void beginE25() {
        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        double x = in.nextDouble();

        double y = (3*Math.pow(x,6)) - (6*Math.pow(x,2))-7;
        System.out.format("Y: "+"%.2f",y);
    }


}
