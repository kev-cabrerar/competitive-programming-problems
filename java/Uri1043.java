package java;

import java.util.Scanner;

public class Uri1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        if (a < (b + c) && b < (c + a) && c < (a + b)) {
            System.out.printf("Perimetro = %.1f%n", (a + b + c));
        } else {

            System.out.printf("Area = %.1f%n", ((a + b) * c) / 2);
        }

    }

}
