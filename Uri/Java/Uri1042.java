package Java;

import java.util.Scanner;
import java.util.Arrays;

public class Uri1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = new int[3];
        int[] aux = new int[3];
        i[0] = sc.nextInt();
        i[1] = sc.nextInt();
        i[2] = sc.nextInt();
        aux[0] = i[0];
        aux[1] = i[1];
        aux[2] = i[2];
        Arrays.sort(i);
        for (int j : i) {
            System.out.print(j + "\n");
        }
        System.out.println();
        for (int k : aux) {
            System.out.print(k + "\n");
        }
    }

}