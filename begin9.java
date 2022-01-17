package com.company;
import java.util.Scanner;
public class begin9 {
    void beginE9(){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite a: ");
        float a = in.nextFloat();
        System.out.println("Vvedite b: ");
        float b = in.nextFloat();

        System.out.println(Math.sqrt(a*b));
    }
}
