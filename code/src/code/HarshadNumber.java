package code;

public class HarshadNumber{
	public boolean isHarshad(int num){

		int sum = Integer.toString(num).chars()
			.map(x -> Integer.parseInt((char)x + ""))
			.sum();
		
		return num % sum ==0;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}
