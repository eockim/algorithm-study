package code;

import java.util.Arrays;

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = null;

        if(n >s){

            answer = new int[1];
            answer[0] = -1;

        }else{

            answer = new int[n];
            int count = s%n;
            for(int i = 0 ; i < n; i++){

                answer[i] = s/n ;
                if(count > 0){
                    answer[i]++;
                    count--;
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        //System.out.println(Arrays.toString(c.bestSet(3,13)));
        System.out.println(Arrays.toString(c.bestSet(17,24)));
    }

}