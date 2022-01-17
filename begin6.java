package com.company;

import java.util.Scanner;
public class begin6 {
    void beginE6() {
        Scanner in = new Scanner(System.in);
//    float a,b,c;
//    float v;
        System.out.print("Введиту а: ");
        float a = in.nextFloat();
        System.out.print("Введиту b: ");
        float b = in.nextFloat();
        System.out.print("Введиту c: ");
        float c = in.nextFloat();
        float v = a * b * c;
        float s = 2 * ((a * b) + (b * c) + (a * c));
        System.out.println("V: "+v+"\n"+"S: "+s);
    }
}
