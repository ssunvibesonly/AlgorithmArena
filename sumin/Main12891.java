package AlgorithmArena.sumin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12891 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0; // while문 용도
        int rtnVal = 0; // 정답값

        int pwdMaxLength = 0; // DNA 문자열 길이  9
        int pwdLength = 0;    // 비밀번호로 사용할 부분문자열의 길이  8
        String[] dnaChar = new String[4];    // DNA문자열
        int A = 0; // A횟수
        int C = 0; // C횟수
        int G = 0; // G횟수
        int T = 0; // T횟수

        while (i < 3) {
            if(i == 0) {
                String[] split = br.readLine().split(" ");
                pwdMaxLength = Integer.parseInt(split[0]);
                pwdLength = Integer.parseInt(split[1]);
            } else if(i == 1) {
                dnaChar = br.readLine().split("");
            } else {
                String[] split = br.readLine().split(" ");
                A = Integer.parseInt(split[0]);
                C = Integer.parseInt(split[1]);
                G = Integer.parseInt(split[2]);
                T = Integer.parseInt(split[3]);
            }
            i++;
        }

        int Achk = A;
        int Cchk = C;
        int Gchk = G;
        int Tchk = T;
        // 8 9
        for(int j=0; j< pwdMaxLength - pwdLength; j++){
            for(int k=j+1; k<dnaChar.length; k++){
                if ("A".equals(dnaChar[k]) && A>0) {
                    Achk--;
                } else if ("C".equals(dnaChar[k]) && C>0) {
                    Cchk--;
                } else if ("G".equals(dnaChar[k]) && G>0) {
                    Gchk--;
                } else if ("T".equals(dnaChar[k]) && T>0) {
                    Tchk--;
                } else{
                    Achk = A;
                    Cchk = C;
                    Gchk = G;
                    Tchk = T;
                    rtnVal = 0;
                    break;
                }
                if(Achk+Cchk+Gchk+Tchk ==0){
                    Achk = A;
                    Cchk = C;
                    Gchk = G;
                    Tchk = T;
                    rtnVal ++;
                    break;
                }

            }

        }

        System.out.println(rtnVal);

    }
}
