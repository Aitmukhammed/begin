package com.company;
import java.util.Scanner;
public class begin12 {
    void beginE12() {
        Scanner in = new Scanner(System.in);

        System.out.println("A: ");
        float a = in.nextFloat();


        System.out.println("B: ");
        float b = in.nextFloat();


        double c = Math.sqrt((a*a)+(b*b));

        double p = a + b +c;
        System.out.format("Гипотенуза: "+"%.2f",c);
        System.out.println();
        System.out.format("Периметр: "+"%.2" + "f",p);

    }
}
