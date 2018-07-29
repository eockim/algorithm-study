package code;

import java.util.stream.Collectors;

public class ReverseInt {
	public int reverseInt(int n){
		
		return Integer.parseInt(Integer.toString(n).chars()
				.map(x -> -Integer.parseInt((char)x +""))
				.sorted().map(x -> -x)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining()) );
	}
  
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
