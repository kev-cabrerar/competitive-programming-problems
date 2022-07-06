package java;

import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        Float A = sc.nextFloat() * sc.nextFloat();
        sc.next();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", A + sc.nextFloat() * sc.nextFloat());

    }

}