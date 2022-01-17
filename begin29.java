package com.company;

import java.util.Scanner;
public class begin29 {
    void beginE29() {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Значение угла в градусах: ");
        double a = in.nextDouble();

        double result = pi * a/180;
        System.out.println(result);
        // Определить этого угла в радианах
    }
}