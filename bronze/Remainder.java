package baekjoon.bronze;

import java.util.Scanner;

// Level : Bronze2
public class Remainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] remainArr = new int[10];
        boolean bl;
        int count = 0;

        for (int i = 0; i < remainArr.length; i++) {
            remainArr[i] = input.nextInt() % 42;
        }

        for (int i = 0; i < remainArr.length; i++) {
            bl = false;
            for (int j = i + 1; j < remainArr.length; j++) {
                if (remainArr[i] == remainArr[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
