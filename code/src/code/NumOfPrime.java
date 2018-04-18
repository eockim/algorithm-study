package code;

import java.util.stream.Stream;

class NumOfPrime {
	int numberOfPrime(int n) {
		
		int result = 0;
		for(int i = 2; i <= n; i++) {
			int compare = i;
			if(Stream.iterate(2,s->s+1).limit(n).filter(s-> compare%s ==0).count() == 1) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(5) );
	}

}