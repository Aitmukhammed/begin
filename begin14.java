package com.company;
import java.util.Scanner;
public class begin14 {
    void beginE14() {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;

        double r = 13.73 / (2 * pi);
        System.out.format("R: "+"%.2f",r);

        System.out.println();

        double s = pi * (r*r);
        System.out.format("S: "+"%.2f",s);

        System.out.println();

        double L = 2 * pi * r;
        System.out.println("L: "+L);


    }
}
