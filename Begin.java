package com.company;

import java.util.Scanner;

public class Begin {
    void Begin1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a:");
        double a = in.nextDouble();
        double P = 4 * a;
        System.out.println("Периметр квадрата:" + P);
    }
}
