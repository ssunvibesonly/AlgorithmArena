package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과 발생(틀림)
public class BaekJoon_11659_X {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int cnt =  Integer.parseInt(st.nextToken());
        int sumCnt = Integer.parseInt(st.nextToken());

        int [] arr = new int[cnt];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < sumCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken())-1;
            int second = Integer.parseInt(st.nextToken())-1;

            int sum = 0;
            for (int j = first; j <= second; j++) {
                sum += arr[j];
            }
            sb.append(sum).append("\n");

        }

        System.out.println(sb.toString());
    }
}
