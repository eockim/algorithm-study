package code;

import java.util.List;
import java.util.Vector;

class SumMatrix {
	
	
	int[][] sumMatrix(int[][] A, int[][] B) {
		
		int rowA = A.length;
		int colA = rowA == 0 ? 0 : A[0].length;
		int rowB = B.length;
		int colB = rowB == 0 ? 0 : B[0].length;
		int[][] answer = null;
		
		if(rowA == rowB && colA == colB) {

			answer = new int[rowA][colA];
			
			for(int i = 0; i < rowA; i++) {
			
				if(A[i].length != colA || B[i].length != colB) {
					answer = null;
					break;
				}else {
					for(int j = 0 ; j < colA; j++) {
						
						answer[i][j] = A[i][j] + B[i][j];
						
					}
				}
				
			}
			
		}

		return answer;
	}

	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2,}, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
		
	}
}