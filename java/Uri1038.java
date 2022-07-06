package java;

import java.util.Scanner;

public class Uri1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        float n;
        switch (x) {
            case 1:
                n = 4.00f;
                break;
            case 2:
                n = 4.50f;
                break;
            case 3:
                n = 5.00f;
                break;

            case 4:
                n = 2.00f;
                break;
            case 5:
                n = 1.50f;
                break;
            default:
                n = 0f;
                break;
        }
        System.out.printf("Total: R$ %.2f\n", y * n);

    }

}