package Java;

import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t / 365 + " ano(s)\n" + (t % 365) / 30 + " mes(es)\n" + (t % 365) % 30 + " dia(s)");

    }

}