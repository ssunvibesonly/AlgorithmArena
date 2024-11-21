package AlgorithmArena.sumin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12891_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int whileIdx = 0; // while문 용도
        int rtnVal = 0; // 정답값

        int pwdMaxLength = 0; // DNA 문자열 길이  9
        int windowStartIdx = 0;    // 비밀번호로 사용할 부분문자열의 길이  8  ( 윈도우 배열의 길이를 의미)
        String[] dnaChar = new String[4];    // DNA문자열 가변
        int A = 0; // A횟수
        int C = 0; // C횟수
        int G = 0; // G횟수
        int T = 0; // T횟수

        while (whileIdx < 3) {
            if(whileIdx == 0) {
                String[] split = br.readLine().split(" ");
                pwdMaxLength = Integer.parseInt(split[0]);
                windowStartIdx = Integer.parseInt(split[1]);
            } else if(whileIdx == 1) {
                dnaChar = br.readLine().split("");
            } else {
                String[] split = br.readLine().split(" ");
                A = Integer.parseInt(split[0]);
                C = Integer.parseInt(split[1]);
                G = Integer.parseInt(split[2]);
                T = Integer.parseInt(split[3]);
            }
            whileIdx++;
        }


        int Achk = 0; // A횟수
        int CChk = 0; // C횟수
        int GChk = 0; // G횟수
        int TChk = 0; // T횟수

        // 초기에 0부터 pwdLength까지 확인 (슬라이딩 윈도우)
        for(int i=0; i<windowStartIdx; i++){
            switch (dnaChar[i]){
                case "A" : Achk ++; break;
                case "C" : CChk ++; break;
                case "G" : GChk ++; break;
                case "T" : TChk ++; break;
            }
        }
        // 초기 슬라이딩에서 값이 일치하는것 확인
        if(Achk >= A && CChk >= C && GChk >= G && TChk >= T){
            rtnVal++;
        }
        // 이후 슬라이딩은 기존값을 삭제하면서 확인

// GATATA

        for(int i=windowStartIdx; i < pwdMaxLength; i++) {

            // 이전값 삭제
            switch (dnaChar[i-windowStartIdx]){
                case "A" : Achk --; break;
                case "C" : CChk --; break;
                case "G" : GChk --; break;
                case "T" : TChk --; break;
            }

            switch (dnaChar[i]){
                case "A" : Achk ++; break;
                case "C" : CChk ++; break;
                case "G" : GChk ++; break;
                case "T" : TChk ++; break;
            }

            if(Achk >= A && CChk >= C && GChk >= G && TChk >= T){
                rtnVal++;
            }
        }


        System.out.println(rtnVal);
    }
    
}
