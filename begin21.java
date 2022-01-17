package com.company;

import java.util.Scanner;
public class begin21 {
    void beginE21() {
        Scanner in = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = in.nextDouble();
        System.out.print("y1: ");
        double y1 = in.nextDouble();

        System.out.print("x2: ");
        double x2 = in.nextDouble();
        System.out.print("y2: ");
        double y2 = in.nextDouble();

        System.out.print("x3: ");
        double x3 = in.nextDouble();
        System.out.print("y3: ");
        double y3 = in.nextDouble();

        double a = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double b = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        double c = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double P = a+b+c;

        double pp = (a+b+c)/2;
        double S = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
        System.out.println("P: "+P);
        System.out.println("S: "+S);
    }
}
