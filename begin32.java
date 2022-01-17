package com.company;

import java.util.Scanner;
public class begin32 {
    void beginE32() {
        Scanner in = new Scanner(System.in);

        System.out.print("Температура в градусах цельсия: ");
        double tc = in.nextDouble();
        double tf;
        tf = tc + 32 * 9/5;


        System.out.println("TC меняем на TF: "+tf);
//        Определить эту тепмературу в градусах Фаренгейта
    }
}
