package Java;

import java.util.Scanner;

public class Uri1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(((t / 60) / 60) % 60 + ":" + (t / 60) % 60 + ":" + t % 60);
    }

}