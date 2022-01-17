package com.company;

import java.util.Scanner;
public class begin31 {
    void beginE31() {
        Scanner in = new Scanner(System.in);

        System.out.println("Температура в градусах фаренгейта: ");
        double tf = in.nextDouble();

//        Определить эту тепмературу в градусах Цельсия

        double tc = (tf - 32)*5/9;
        System.out.println("TF меняем на TC: "+tc);
    }
}
