package code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Collatz {
	public int collatz(int num) {
		int answer = -1;
		
		List<Integer> list = Stream.iterate(num, a -> a%2 == 0 ? a/2 : a * 3 + 1)
				.limit(500).collect(Collectors.toList());
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 1){
				answer = i;
				break;
			}
		}
		
		
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
