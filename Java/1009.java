package Java;

import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.printf("TOTAL = R$ %.2f\n", (sc.nextDouble() + sc.nextDouble() * 0.15));
    }

}