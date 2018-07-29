package code;

import java.util.stream.IntStream;

public class GetMean {
    public int getMean(int[] array) {
    	
        return IntStream.of(array).parallel().sum()/array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}