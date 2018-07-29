package code;

import java.util.ArrayList;
import java.util.Arrays;

public class LineCombination {

    public int[] setAlign(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] fac = new int[n+1];
        fac[0] = 1;
        for(int i=1;i<n;i++) {
            fac[i] = fac[i-1]*i;
        }
        int idx = 0;
        for(int i=0;i<n;i++) {
            list.add(i+1);
        }
        for(int i=0;i<n;i++) {
            idx=(int) ((k-1)/fac[n-1-i]);
            answer[i]=list.get(idx);
            list.remove(idx);
            k=(k-1)%fac[n-1-i]+1;
        }
        return answer;
//        int[] answer = new int[n];
//        List<Integer> arrayList = new ArrayList<Integer>();
//        long total = 1;
//        long remain = 0;
//        long index = 0;
//
//        for(int i = 1; i <= n; i++){
//            total *= i;
//            index = i;
//            arrayList.add(i);
//        }
//
//        remain = k -1;
//        for(int i = 0; i < n; i++){
//
//            answer[i] = (int)(remain/(total/index));
//            if(remain == 0){
//                answer[i] = 0;
//            }
//
//            if(answer[i] != 0){
//                System.out.println("total : " + total + " index : " + index);
//                remain = (int)((remain -1)%(total/index)) +1;
//
//            }
//
//            System.out.println("remain : " + remain);
//            total/=index;
//            index--;
//        }
//        int count = 0;
//        for(int i = 0 ; i < answer.length; i++){
//            System.out.println("answer[i] " + answer[i]);
//            System.out.println(arrayList.size());
//            answer[i] = arrayList.get(answer[i]);
//            arrayList.remove(answer[i]);
//        }
//        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        LineCombination lc = new LineCombination();
        System.out.println(Arrays.toString(lc.setAlign(6, 10) ) );
        System.out.println(0%1);
    }

}
