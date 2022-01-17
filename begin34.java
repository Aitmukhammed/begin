package com.company;

import java.util.Scanner;
public class begin34 {
    void beginE34() {
        Scanner in = new Scanner(System.in);

        System.out.println("X: ");
        double x = in.nextDouble();

        System.out.println("Y: ");
        double y = in.nextDouble();

        System.out.println("A: ");
        double a = in.nextDouble();

        System.out.println("B: ");
        double b = in.nextDouble();

        double kg = a/x;
        System.out.println("Стоимость 1 кг шоколадных конфет: "+kg);

        double iriska = b/y;
        System.out.println("Стоимость Y кг ирисок: "+iriska);

        double dorozhe = kg/iriska;
        System.out.println("Шоколадные конфеты дороже ирисок: "+dorozhe);


    }
}
