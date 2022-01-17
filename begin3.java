package com.company;

import java.util.Scanner;

public class begin3 {
    void BeginE3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        System.out.println("Введите b:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double P = 2 * (a+b);
        double S = a * b;
        System.out.println("Периметр квадрата P: "+P);
        System.out.println("Площадь квадрата S:" + S);
    }
}
