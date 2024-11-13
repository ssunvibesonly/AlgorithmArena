package taehunkim.problems;

import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon_12891 {
    public static void main(String[] args) {
        int result = 0;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        int S = Integer.parseInt(words[0]);
        int P = Integer.parseInt(words[1]);

        String DNA = sc.nextLine();

        String minimumCnt = sc.nextLine();
        String[] minimumCntArr = minimumCnt.split(" ");
        HashMap<String, Integer> minimumCntMap = new HashMap<>();

        minimumCntMap.put("A", Integer.parseInt(minimumCntArr[0]));
        minimumCntMap.put("C", Integer.parseInt(minimumCntArr[1]));
        minimumCntMap.put("G", Integer.parseInt(minimumCntArr[2]));
        minimumCntMap.put("T", Integer.parseInt(minimumCntArr[3]));

        for (int i = 0; i <= DNA.length() - P; i++) {
            boolean isSkip = false;
            String temp = DNA.substring(i, i + P);

            for (String key : minimumCntMap.keySet()) {
                if (minimumCntMap.get(key) == 0) {
                    continue; // 해당 key의 개수가 0이라면 조건을 확인하지 않고 건너뜁니다.
                }

                int count = (int) temp.chars().filter(ch -> ch == key.charAt(0)).count();

                if (count < minimumCntMap.get(key)) {
                    isSkip = true;
                    break;
                }
            }

            if (!isSkip) {
                result++; // 모든 조건을 만족하는 경우에만 result를 증가
            }
        }

        System.out.println("Result: " + result);
    }
}
