package java;

import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " eh o maior");
        }
        if (b > a && b > c) {
            System.out.println(b + " eh o maior");
        }
        if (c > a && c > b) {
            System.out.println(c + " eh o maior");
        }
    }

}