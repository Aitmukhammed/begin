package com.company;

import java.util.Scanner;
public class begin33 {
    void beginE33() {
        Scanner in = new Scanner(System.in);

        System.out.println("X: ");
        double x = in.nextDouble();

        System.out.println("Y: ");
        double y = in.nextDouble();

        System.out.println("A: ");
        double a = in.nextDouble();

        double kg = a/x;
        System.out.println("Стоимость 1 кг конфет: "+kg);

        double ykg = kg * y;
        System.out.println("Стоимость У кг конфет: "+ykg);







    }
}
