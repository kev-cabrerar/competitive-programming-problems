package java;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fin = sc.nextInt();
        if (inicio == fin) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", 24);
        } else if (inicio > fin) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (24 - inicio) + fin);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", fin - inicio);
        }

    }
}
