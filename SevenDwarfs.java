package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarfs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dwarfs[] = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = input.nextInt();
            sum += dwarfs[i];
        }

        // 거짓말 한 dwarf 2명을 찾기 위해 선언 후 초기화
        int liar1 = 0;
        int liar2 = 0;

        for (int i = 0; i < dwarfs.length; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {

                // dwarfs 배열 정렬
                Arrays.sort(dwarfs);

                // 일곱 난쟁이의 키의 합이 100이므로 dwarfs[] 인덱스 값들 중 liar 값 찾기
                if (sum - dwarfs[i] - dwarfs[j] == 100) {
                    liar1 = dwarfs[i];
                    liar2 = dwarfs[j];
                }
            }
        }

        // 일곱 난쟁이 값 출력
        for (int i = 0; i < dwarfs.length; i++) {
            if (dwarfs[i] != liar1 && dwarfs[i] != liar2) {
                System.out.print(dwarfs[i] + " ");
            }
        }
    }
}