package src.taehunkim.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()); // 첫 줄에서 N 입력 받기
        ArrayList<Integer> numbers = new ArrayList<>();

        // N개의 줄에서 숫자 입력 받기
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(sc.nextLine()));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}