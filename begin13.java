package com.company;
import java.util.Scanner;
public class begin13 {
    void beginE13() {
        Scanner in = new Scanner(System.in);

        System.out.print("R1: ");
        double r1 = in.nextDouble();
        System.out.print("R2: ");
        double r2 = in.nextDouble();

        double pi = 3.14;
        double s1 = pi * Math.pow(r1, 2);
        double s2 = pi * Math.pow(r2, 2);
        double s3 = s1 -s2;

        System.out.println("S1: "+s1 +"\n" +
                           "s2: "+s2 +"\n" +
                           "s3: "+s3);
    }
}
