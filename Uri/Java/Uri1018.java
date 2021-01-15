package Java;

import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = sc.nextInt();
        System.out.println(aux);
        System.out.println(aux / 100 + " nota(s) de R$ 100,00");
        aux %= 100;
        System.out.println(aux / 50 + " nota(s) de R$ 50,00");
        aux %= 50;
        System.out.println(aux / 20 + " nota(s) de R$ 20,00");
        aux %= 20;
        System.out.println(aux / 10 + " nota(s) de R$ 10,00");
        aux %= 10;
        System.out.println(aux / 5 + " nota(s) de R$ 5,00");
        aux %= 5;
        System.out.println(aux / 2 + " nota(s) de R$ 2,00");
        aux %= 2;
        System.out.println(aux / 1 + " nota(s) de R$ 1,00");
    }

}