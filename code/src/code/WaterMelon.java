package code;

public class WaterMelon {
	public String watermelon(int n){
		
		String result = "";
		for(int i = 0 ; i < n/2; i++) {
			result += "����";
		}
		
		return n%2 == 0 ? result : result + "��";
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n��5�� ���: " + wm.watermelon(5));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}