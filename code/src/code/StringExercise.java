package code;

public class StringExercise{
    String getMiddle(String word){

    	return word.length() != 0 ? word.substring(word.length()%2 == 0 ? word.length()/2 - 1 : word.length() / 2, word.length()/2 + 1) : "";
    	//return middle;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle(""));
    }
}
