package code;

public class WaterMelon {
	public String watermelon(int n){
		
		String result = "";
		for(int i = 0 ; i < n/2; i++) {
			result += "수박";
		}
		
		return n%2 == 0 ? result : result + "수";
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이5인 경우: " + wm.watermelon(5));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}
