package com.company;

import java.util.Scanner;
public class begin5 {
    void beginE5()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        double a = in.nextDouble();
        double v = (a*a*a);
        double s = (6*(a*a));
        System.out.println("V: "+v);
        System.out.println("S: "+s);
    }

}
