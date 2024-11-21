package AlgorithmArena.sumin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main11660 {

    
    // 시간초과
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int whileIdx = 0; // while문 용도

        int N = 0; // 배열의크기
        int M = 0; // 합횟수
        int x1 =0;
        int y1 =0;
        int x2 =0;
        int y2 =0;

        int startIdx = 1; // 시작

        int[][] sumTable = new int[N][M];
        List<Object> intList = new ArrayList<>();
        List<Object> sumArrayList = new ArrayList<>();

        while (whileIdx < startIdx) {
            if(whileIdx == 0) {
                String[] split = br.readLine().split(" ");
                N = Integer.parseInt(split[0]);
                M = Integer.parseInt(split[1]);
                startIdx += (N+M);
            } else if(0 < whileIdx &&  whileIdx <= N) {
                String[] split = br.readLine().split(" ");
                int [] list = new int[split.length];
                int [] sumList = new int[split.length+1];

                for(int i=0; i<split.length; i++){
                    list[i] = Integer.parseInt(split[i]);
                    //sumTable[][i+1] = sumTable[whileIdx-1][i] + list[i];
                    sumList[i+1] = sumList[i] + list[i];
                }
                //System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
                intList.add(list);
                sumArrayList.add(sumList);
                //sumTable[N-1][M-1] = sumList[N-1];

            } else {
                String[] split = br.readLine().split(" ");
                x1 = Integer.parseInt(split[0]); // 2  시작 행
                y1 = Integer.parseInt(split[1]); // 2  시작 열
                x2 = Integer.parseInt(split[2]); // 4  끝 행
                y2 = Integer.parseInt(split[3]); // 4  끝 열
                int rtnVal = 0; // 정답값
                for(int i=x1; i<= x2 ; i++){
                    int[] list = (int[])sumArrayList.get(i-1);
                    rtnVal += (list[y2] - list[y1-1]);
                }
                System.out.println("rtnVal = " + rtnVal);
/*
                for (Object object : sumArrayList) {
                    int[] list = (int[])object;
                    System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
                }

 */
            }
            whileIdx++;


        }
    }
}
