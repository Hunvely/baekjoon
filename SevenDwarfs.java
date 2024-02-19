package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarfs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                Arrays.sort(arr);

                if (sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[a] && arr[i] != arr[b]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}