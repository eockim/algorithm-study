package code;

public class PrintTriangle {
	public String printTriangle(int num){
		
		String result = "";
		for(int i = 0; i < num; i++) {
			for(int j = 0 ; j <= i; j++) {
				result += "*";
			}
			result += "\n";
		}
		return result;		
	}
	
	public String printTriangle2(int num) {
		String result = "";
        String stars = "*";
        for(int i=0; i<num; ++i){
            result += stars+"\n";
            stars += "*";
            System.out.println("stars : \n" + stars);
        }
        return result;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle2(4) );
	}

}
