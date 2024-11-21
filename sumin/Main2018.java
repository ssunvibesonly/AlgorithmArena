package AlgorithmArena.sumin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int cnt = 0 ; // 경우의 수

        for(int i=0; i<=inputNum; i++){

            int sum = 0;
            for(int j=i+1; j<=inputNum; j++){
                sum += j;
                if(inputNum == sum) {
                    cnt ++;
                    break;
                }else if(sum > inputNum){
                    break;
                }
            }
        }

        System.out.println(cnt);
        //메모리초과();
    }

    static void 메모리초과() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int inputNum2 = inputNum;
        int cnt =0; // 경우의 수
        List<Integer> numList= new ArrayList<>(); // 숫자배열

        while(0 <= inputNum){
            numList.add(inputNum--);
        }

        for(int i=numList.size()-1; i>=0; i--){

            int sum = 0;
            for(int j=i-1; j>=0; j--){
                sum += numList.get(j);
                if(inputNum2 == sum) {
                    cnt ++;
                    break;
                }else if(sum > inputNum2){
                    break;
                }
            }
        }

        System.out.println(cnt);
    };

}