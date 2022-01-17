package com.company;

import java.util.Scanner;
public class begin28 {
    void beginE28() {
        Scanner in = new Scanner(System.in);

        System.out.println("A: ");
        double a = in.nextDouble();

        double res, res1;

        res = a*a;
        System.out.println("Значение A в степени 2 равно:"+res);

        res1 = res * a;
        System.out.println("Значение A в степени 3 равно:"+res1);

        res1 = res1 * res;
        System.out.println("Значение A в степени 5 равно:"+res1);

        res = res1*res1;
        System.out.println("Значение A в степени 10 равно:"+res);

        res1 = res1 *res;
        System.out.println("Значение A в степени 15 равно:"+res1);

    }
}
