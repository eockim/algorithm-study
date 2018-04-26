package code;

public class OneTwoFour {

    public String change124(int n) {

        String answer = "";
        while(n > 0){

            answer = (n%3 == 0 ? "4" : n%3 == 1 ? "1" : "2") + answer;
            if(n%3 == 0){
                n-=1;
            }
            n /=3;
        }
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        OneTwoFour oneTwoFour = new OneTwoFour();
        System.out.println(oneTwoFour.change124(3) );
    }
}
