package code;

public class HarshadNumber{
	public boolean isHarshad(int num){

		int sum = Integer.toString(num).chars()
			.map(x -> Integer.parseInt((char)x + ""))
			.sum();
		
		return num % sum ==0;
	}
  
       // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}
