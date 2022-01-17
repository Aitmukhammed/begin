package com.company;

import java.util.Scanner;
public class begin8 {
    void beginE8(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        float a = in.nextFloat();
        System.out.println("Введите b: ");
        float b = in.nextFloat();
        float sred = (a+b)/2;
        System.out.println("Среднее арифметическое число: "+sred);
    }
}
