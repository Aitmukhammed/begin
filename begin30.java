package com.company;

import java.util.Scanner;
public class begin30 {
    void beginE30() {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Значение угла в градусах: ");
        double a = in.nextDouble();

        double result = a * 180/pi;
        System.out.println(result);
        // Определить этого угла в градусах
    }
}
