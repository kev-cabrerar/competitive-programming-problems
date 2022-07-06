package java;

import java.util.Scanner;

public class Uri1040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m = (sc.nextFloat() * 2 + sc.nextFloat() * 3 + sc.nextFloat() * 4 + sc.nextFloat() * 1) / (10);
        System.out.printf("Media: %.1f\n", m);

        if (m < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (m >= 5.0 && m <= 6.9) {
            System.out.println("Aluno em exame.");
            float ex = sc.nextFloat();
            System.out.println("Nota do exame: " + ex);
            m = (m + ex) / 2;

            if (m > 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", m);

        } else if (m > 7.0) {
            System.out.println("Aluno aprovado.");
        }

    }

}