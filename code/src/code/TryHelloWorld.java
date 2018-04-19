package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class TryHelloWorld{

    public int getMinSum(int []A, int []B){

        int answer = 0;
        Arrays.sort(A);
        B = IntStream.of(B).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[i];
        }

        return answer;
    }

    public static void main(String[] args){

        TryHelloWorld test = new TryHelloWorld();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));

    }
}
