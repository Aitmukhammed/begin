package com.company;
import java.util.Scanner;
public class begin11 {
    void beginE11() {
        Scanner in = new Scanner(System.in);
        int kv = 2;

        System.out.print("a: ");
        float AA = in.nextFloat();
        AA = Math.abs(AA);

        System.out.print("b: ");
        float BB = in.nextFloat();
        BB = Math.abs(BB);

        float result1 = AA + BB;
        float result2 = AA - BB;
        float result3 = AA * BB;
        float result4 = AA / BB;

        System.out.println("A^2 + B^2 = " + result1);
        System.out.println("A^2 - B^2 = " + result2);
        System.out.println("A^2 * B^2 = " + result3);
        System.out.println("A^2 / B^2 = " + result4);

    }
}