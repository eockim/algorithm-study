package code;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NextNum {

    public int nextBigNumber(int n){

        int answer = 0;
        long count = Integer.toBinaryString(n).chars().mapToObj(x -> (char)x).filter(x -> x.toString().equals("1")).count();
        boolean result = false;

        while(!result){

            if(count == Integer.toBinaryString(++n).chars()
                    .mapToObj(x -> (char)x)
                    .filter(x -> x.toString()
                    .equals("1"))
                    .count()){
                answer = n;
                result = true;
            }

        }
        return answer;

    }
    public static void main(String[] args){

        NextNum test = new NextNum();
        int n = 78;
        //System.out.println(test.nextBigNumber(n));\
        System.out.println(Integer.toBinaryString(76));
        System.out.println(Integer.bitCount(76));

    }

}
