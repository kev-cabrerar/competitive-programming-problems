package Java;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tMinutosInicio = sc.nextInt() * 60 + sc.nextInt();
        int tMinutosFin = sc.nextInt() * 60 + sc.nextInt();
        sc.close();
        int t = tMinutosFin > tMinutosInicio ? tMinutosFin - tMinutosInicio
                : 1440 - tMinutosInicio + tMinutosFin;
        int h = t / 60;
        int m = t % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", h, m);

    }

}
