package baekjoon.bronze;

import java.util.Scanner;

// Level : Bronze3
public class Star {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int star = input.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < star; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (star - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
