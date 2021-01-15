package Java;

import java.util.Scanner;

public class Uri1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if (n >= 0 && n <= 25.0000) {
            System.out.printf("Intervalo [0,25]\n");
        } else if (n >= 25.00001 && n <= 50.0000000) {
            System.out.printf("Intervalo (25,50]\n");
        } else if (n >= 50.00001 && n <= 75.0000000) {
            System.out.printf("Intervalo (50,75]\n");
        } else if (n >= 75.00001 && n <= 100.0000000) {
            System.out.printf("Intervalo (75,100]\n");
        } else {
            System.out.print("Fora de intervalo\n");

        }

    }

}