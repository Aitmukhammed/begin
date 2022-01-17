package com.company;

import java.util.Scanner;

public class begin2 {
        void BeginE2(){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите a:");
            double a = in.nextDouble();
            double S = a * a;
            System.out.println("Площадь квадрата:" + S);
        }
}
