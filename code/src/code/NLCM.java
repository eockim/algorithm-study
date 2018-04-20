package code;

import java.util.Arrays;

public class NLCM {

    public long nlcm(int[] num) {
        long answer = 0;
        Arrays.sort(num);
        Long[] compare = new Long[2];
        compare[0] = Long.parseLong(num[0] + "");

        for(int i = 1; i < num.length; i++){

            compare[1] = Long.parseLong(num[i] + "");
            Arrays.sort(compare);
            answer = 0;

            for(int j = 2 ; j <= compare[0]; j++){
                if(compare[0] % j == 0 && compare[1] % j == 0){
                    answer = j * compare[0]/j * compare[1]/j;
                }
            }

            if(answer == 0){
                answer = compare[0] * compare[1];
            }

            compare[0] = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 54, 67, 92, 28, 6, 20, 69, 85, 25, 53 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
