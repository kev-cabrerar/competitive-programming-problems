package Java;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double salario = 0.0;
        double porcentaje = 0.0;

        if (num >= 0 && num <= 400) {
            porcentaje = 0.15;
        }
        if (num > 400 && num <= 800) {
            porcentaje = 0.12;
        }
        if (num > 800 && num <= 1200) {
            porcentaje = 0.10;
        }
        if (num > 1200 && num <= 2000) {
            porcentaje = 0.07;
        }
        if (num > 2000) {
            porcentaje = 0.04;
        }
        salario = num * (porcentaje + 1);
        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", salario - num);
        System.out.printf("Em percentual: %.0f %%%n", porcentaje * 100);

    }
}
