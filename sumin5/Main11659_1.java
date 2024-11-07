package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11659_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int numberCnt = 0; // 수의 개수
        int tryCnt = 1; // 시도 횟수
        int numberArr[] = new int[10]; // 숫자배열
        int sumArr[] = new int[11];    // 미리 계산한 배열;

        int i =0;

        while(i <= tryCnt){ //

            if(i==0){ // 첫번째  수의 개수와 합을 구해야 하는 횟수
                str = br.readLine();
                String[] firstInputSplit = str.split(" ");
                numberCnt = Integer.parseInt(firstInputSplit[0]);
                tryCnt += Integer.parseInt(firstInputSplit[1]);
            } else if (i == 1 ){ // 숫자 배열 넣기
                numberArr = new int[numberCnt];
                str = br.readLine();
                String[] inputNumArr = str.split(" ");
                for(int j=0; j<inputNumArr.length; j++){
                    numberArr[j] = Integer.parseInt(inputNumArr[j]);
                }

                // 5 4 3 2 1 // 배열[4]

                // 0                            배열[0]  = 0
                // 5              / 1,1 입력     배열[1]  = 5
                // 5+4 = 9        / 1,2 입력     배열[2]  = 9
                // 5+4+3 = 12     / 1,3 입력     배열[3]  = 12
                // 5+4+3+2 = 14   / 1,4 입력     배열[4]  = 14
                // 5+4+3+2+1 = 15 / 1,5 입력     배열[5]  = 15



                sumArr = new int[numberCnt+1];
                for(int j=0; j<numberCnt; j++){  // 미리 계산
                    // 0 은 알아서 들어감
                    sumArr[j] = sumArr[j] + numberArr[j]  ;
                }

                int cntt = 0 ;
                for (int i1 : sumArr) {
                    System.out.println("배열["+(cntt++) + "] = " + i1);
                }

            }else{

                str = br.readLine();
                String[] rangeSet = str.split(" ");

                int start = Integer.parseInt(rangeSet[0]);
                int end = Integer.parseInt(rangeSet[1]);

                System.out.println("sumArr = " + sumArr[end]);
                System.out.println("sumArr = " + sumArr[start]);

                System.out.println(sumArr[end] - sumArr[start-1]);

            }
            i++;

        }
        //System.out.println("sumArr = " + Arrays.toString(sumArr));

    }

}
