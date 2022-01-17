package com.company;

import java.util.Scanner;
public class begin7 {
    void beginE7(){
        Scanner in = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("Введите r: ");
        float r = in.nextFloat();
        float l = 2 * pi * r;
        float s = pi * (r*r);
        System.out.println("L: "+l);
        System.out.println("S: "+s);


    }
}
