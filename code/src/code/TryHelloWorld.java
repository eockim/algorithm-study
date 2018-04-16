package code;

import java.util.Arrays;

public class TryHelloWorld {
	 public int[] gcdlcm(int a, int b) {
	        int[] answer = new int[2];
	        
	        answer[0] = 1;
	        for(int i = 2; i <= Math.min(a, b); i++) {
	        	if(a % i == 0 && b % i == 0) {
	        		answer[0] *= i;
	        		answer[1] = i * (a/i) * (b/i);
	        		a/=i;
	        		b/=i;
	        	}
	        }
	        
	        if(answer[1] == 0) {
	        	answer[1] = a * b;
	        }

	        return answer;
	    }
	 
	 public int[] gcdlcm2(int a, int b) {
		 int[] answer = new int[2];
	        int standard = (a > b) ? a : b;

	        for(int i=1; i<=standard; i++){
	          if(a % i == 0 && b % i == 0) answer[0] = i;
	        }
	        answer[1] = (a * b) / answer[0];

	        return answer;
	 }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	        TryHelloWorld c = new TryHelloWorld();
	        System.out.println(Arrays.toString(c.gcdlcm2(24, 36)));
	    }

}
