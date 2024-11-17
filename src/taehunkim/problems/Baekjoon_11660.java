package src.taehunkim.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_11660 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N, M 입력 받기
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int N = Integer.parseInt(words[0]);
        int M = Integer.parseInt(words[1]);

        // 2. 2차원 배열 입력 받기
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            String rowInput = sc.nextLine();
            String[] rowWords = rowInput.split(" ");
            for (String rowWord : rowWords) {
                row.add(Integer.parseInt(rowWord));
            }
            matrix.add(row);
        }

        // 3. M 만큼 반복
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            String xyInput = sc.nextLine();
            String[] xyWords = xyInput.split(" ");
            int x1 = Integer.parseInt(xyWords[0]) - 1;
            int y1 = Integer.parseInt(xyWords[1]) - 1;
            int x2 = Integer.parseInt(xyWords[2]) - 1;
            int y2 = Integer.parseInt(xyWords[3]) - 1;

            for (int j = y1; j <= y2; j++) {
                int sum = 0;
                for (int k = x1; k <= x2; k++) {
                    sum += matrix.get(j).get(k);;
                }

                result[i] += sum;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
