package code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindKim {
	public String findKim(String[] seoul){
		//x�� �輭���� ��ġ�� �����ϼ���.

		return "�輭���� "+ Arrays.asList(seoul).indexOf("Kim") + "�� �ִ�";
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
	
}
