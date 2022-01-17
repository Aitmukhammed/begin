package com.company;

import java.util.Scanner;
public class begin19 {
    void beginE19() {
        Scanner in = new Scanner(System.in);
        System.out.println("x1: ");
        double x1 = in.nextDouble();

        System.out.println("y1: ");
        double y1 = in.nextDouble();

        System.out.println("x2: ");
        double x2 = in.nextDouble();

        System.out.println("y2: ");
        double y2 = in.nextDouble();

        double p = 2*(Math.abs(x1+x2)+Math.abs(y1-y2));
        System.out.format("Периметр: "+"%.2f",p);

        System.out.println();

        double s = (Math.abs(x1-x2)*Math.abs(y1-y2));
        System.out.format("Площадь: "+"%.2f",s);
    }
}
