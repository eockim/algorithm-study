package code;

public class Expressions {

    public int expressions(int num) {
        int answer = 0;
        int index = 1;
        while(index <= num){

            int sum = 0 ;
            for(int i = index; i <= num; i++){

                System.out.println("i : " + i);
                sum += i;
                if(sum > num){
                    break;
                }else if(sum == num){
                    answer++;
                    break;
                }
            }
            index++;
        }

        return answer;
    }

    public static void main(String args[]) {
        Expressions expressions = new Expressions();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(expressions.expressions(15));
    }

}


