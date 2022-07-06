package java;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            System.out.printf("R$ %.2f%n", ((salario - 2000.0) * 0.08));
        } else if (salario > 3000 && salario <= 4500) {
            System.out.printf("R$ %.2f%n", ((((salario - 2000.0) - (salario - 3000.0))
                    * 0.08) + (salario - 3000.0) * 0.18));
        } else if (salario > 4500) {
            System.out.printf("R$ %.2f%n", ((((salario - 2000.0) - (salario - 3000.0))
                    * 0.08) + (((salario - 3000.0) - (salario - 4500.0)) * 0.18) + ((salario - 4500.0) * 0.28)));
        }

        sc.close();
    }
}
