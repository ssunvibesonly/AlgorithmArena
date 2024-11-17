package src.taehunkim.problems;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_11660_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2차원 누적합 배열 (1-based indexing)
        int[][] prefixSum = new int[N + 1][N + 1];

        // 원본 배열 입력받으면서 바로 누적합 계산
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                prefixSum[i][j] = Integer.parseInt(st.nextToken()) +
                        prefixSum[i-1][j] +
                        prefixSum[i][j-1] -
                        prefixSum[i-1][j-1];
            }
        }

        // 쿼리 처리
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            int result = prefixSum[x2][y2] -
                    prefixSum[x2][y1-1] -
                    prefixSum[x1-1][y2] +
                    prefixSum[x1-1][y1-1];

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}