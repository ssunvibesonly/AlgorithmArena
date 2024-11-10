package taehunkim;

import java.util.Scanner;

public class Baekjoon_2018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= N / 2; i++) {
            int sum = 0;
            int j = i;
            while (true) {
                sum += j;
                if (sum > N) {
                    break;
                } else if (sum == N) {
                    result++;
                    break;
                }
                j++;
            }
        }

        System.out.println(result);
    }
}
