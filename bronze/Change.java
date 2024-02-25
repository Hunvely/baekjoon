package baekjoon.bronze;

import java.util.Scanner;

// Level : Bronze2
public class Change {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int change = 1000 - input.nextInt();
        int changeCount = 0;
        int[] yen = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < yen.length; i++) {
            if (change / yen[i] != 0) {
                changeCount += change / yen[i];
                change %= yen[i];
            }
        }
        System.out.println(changeCount);
    }
}
