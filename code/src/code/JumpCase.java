package code;

import java.util.Stack;

public class JumpCase{

    int answer = 0;

    public int jumpCase(int num) {

        if(num == 1){
            return 1;
        }else if (num == 2){
            return 2;
        }

        return jumpCase(num -1) + jumpCase(num -2);
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }

}
