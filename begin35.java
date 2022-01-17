package com.company;

import java.util.Scanner;
public class begin35 {
    void beginE35() {
        Scanner in = new Scanner(System.in);

        System.out.println("V: ");
        double v = in.nextDouble();

        System.out.println("U: ");
        double u = in.nextDouble();

        System.out.println("t1: ");
        double t1 = in.nextDouble();

        System.out.println("t2: ");
        double t2 = in.nextDouble();

        double s = v*t1+(v-u)*t2;
        System.out.println("S: "+s);

    }
}
