package baekjoon.bronze;

import java.util.Scanner;

// Level : Bronze3
public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();
        int strLen = str.length();
        int strPalindrome = 1;

        for (int i = 0; i < strLen / 2; i++) {
            if (str.charAt(i) != str.charAt(strLen - 1 - i)) {
                strPalindrome = 0;
            }
        }
        System.out.println(strPalindrome);
    }
}
