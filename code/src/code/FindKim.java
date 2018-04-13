package code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindKim {
	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.

		return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
	
}
