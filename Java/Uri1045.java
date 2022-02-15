package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double[] list_sorted = { a, b, c };
        Arrays.sort(list_sorted);
        a = list_sorted[2];
        b = list_sorted[1];
        c = list_sorted[0];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}
