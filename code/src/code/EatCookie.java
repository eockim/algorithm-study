package code;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EatCookie {

    public int eatCookie(int []cookies){
        int answer = 0;

        //Arrays.binarySearch()
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        EatCookie e = new EatCookie();
        int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
        System.out.println(e.eatCookie(cookies));

        int sum = 0;
        int count = 0;

        int[] array = "Hello world!!".chars().sorted().toArray();

        int[] r = new int[238];
        int i;
        r[0] = 1;
        for (int c : "Hello world!!".getBytes()) {
            System.out.println("c : "  + c);
            for (i = 238; i-- > c;) {

                r[i] += r[i - c];
                System.out.println("c : "  + c + " i : " + i + " r[i] : " + r[i]);
            }
        }
        System.out.println("count : "+ r[237]);
    }

}
