package baekjoon.bronze;

import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king = king - input.nextInt();
        queen = queen - input.nextInt();
        rook = rook - input.nextInt();
        bishop = bishop - input.nextInt();
        knight = knight - input.nextInt();
        pawn = pawn - input.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn);
    }
}
