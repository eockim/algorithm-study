package code;

import java.util.Collections;
import java.util.stream.IntStream;

public class NoOvertime {

    public int noOvertime(int no, int[] works) {

        while(no >0){
            works = IntStream.of(works).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
            works[0]--;
            no--;
        }
        return IntStream.of(works).map(x -> x*x).sum();
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        System.out.println(c.noOvertime(4,test));
    }

}
