package code;

class SumDivisor {
	public int sumDivisor(int num) {
		
		int answer = 0;
		for(int i = 1; i <= num ; i++) {
			if(num%i == 0) {
				answer += i;
			}
		}
		return answer;
	}
	
	int robotAttack(int[] robots) {
		
		int result = 0;
		for(int i = 0; i < robots.length; i++) {
			if(i == 0) {
				result += robots[i];
			}else if(robots[i] -2 > 0){
				result += robots[i];
			}
		}
		return result;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}
