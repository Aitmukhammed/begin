package com.company;

import java.util.Scanner;
public class begin39 {
    void beginE39() {
        Scanner in = new Scanner(System.in);

        System.out.println("A: ");
        double a = in.nextDouble();

        System.out.println("B: ");
        double b = in.nextDouble();

        System.out.println("C: ");
        double c = in.nextDouble();

        double d = Math.pow(b,2)-4*a*c;
        double res1 = ((-1)*b+Math.sqrt(d))/(2*a);
        double res2 = ((-1)*b-Math.sqrt(d))/(2*a);

        if(res2<res1) {
            System.out.println("Меньший корень: " + res2);
            System.out.println("Большой корень: " + res1);
        } else{
            System.out.println("Меньший корень: " + res1);
            System.out.println("Большой корень: " + res2);
        }
    }
}
