package java;

import java.io.IOException;
import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("MEDIA = %.5f\n", (sc.nextDouble() * 7 / 22 + sc.nextDouble() * 15 / 22));
    }

}