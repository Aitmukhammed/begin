package com.company;

import java.util.Scanner;

public class begin4 {
    void beginE4() {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Введите d: ");
        double d = in.nextDouble();
        double L = d * pi;
        System.out.println("Длина окружности: "+L);

    }
}
