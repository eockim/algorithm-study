package code;

import java.util.Arrays;
import java.util.stream.Stream;

public class Code {
	final static String[] BOARD_SAMPLE_1  = {"CCBDE", "AAADE", "AAAFF", "CCBFF"};
	final static String[] BOARD_SAMPLE_2 = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
	static int[][] memory;
	static int deleteCount = 0;
	
	static boolean setMemory(int m, int n, String[] board) {
		
		boolean result = false;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(memory[i][j] == 1) {
					result = true;
					if( j == 0) {
						board[i] = "_" + board[i].substring( j + 1, n);
						deleteCount++;
					}else if(j == n - 1){
						board[i] = board[i].substring(0, j) + "_";
						deleteCount++;
					}else {
						board[i] = board[i].substring(0, j) + "_" + board[i].substring( j + 1, n);
						deleteCount++;
					}
				}
				
			}
		}
		
		return result;
		
	}
	
	static boolean inputValue(int m, int n, String[] board){
		
		memory = new int[m][n];
		
		for(int i = 1; i < m; i++ ) {
			for(int j = 1; j < n; j++) {
				check(i, j, board);
			}
		}
		
		return setMemory(m, n, board);
		
	}
	
	static void convert(int m, int n, String[] board) {
		
		String[] convert = new String[n];
		String sortString = "";
		for(int i = 0; i < n; i++) {
			
			for(int j = m - 1; j >= 0; j--) {
				
				sortString += board[j].charAt(i);
			}
			
			char[] tmpChar = sortString.toCharArray();
			
			String tmpString = "";
			for(int k = 0; k < tmpChar.length; k++ ) {
				
				if(tmpChar[k] == '_') {
					tmpString += tmpChar[k]; 
				}
			}
			
			sortString = sortString.replaceAll("_", "");
			sortString += tmpString;
			
			convert[i] = sortString;
			sortString = "";
		}
		
		for(int i = 0; i < m; i++ ) {
			
			board[m - i - 1] = "";
			for(int j = 0; j < n; j++) {
				board[m - i - 1] += convert[j].charAt(i);
				
			}
			
		}
		
	}

	static boolean check(int m, int n, String[] board) {

		boolean result;
		if(board[m].charAt(n) != '_' && board[m].charAt(n - 1) != '_' && board[m - 1].charAt(n) != '_' && board[m - 1].charAt(n - 1) != '_' &&
				board[m].charAt(n) == board[m].charAt(n - 1) &&
						board[m - 1].charAt(n) == board[m - 1].charAt(n - 1) &&
						board[m].charAt(n) == board[m - 1].charAt(n - 1) ) {
			
			memory[m][n] = 1;
			memory[m][n - 1] = 1;
			memory[m - 1][n] = 1;
			memory[m - 1][n - 1] = 1;
			
			result = true;
			
		}else {
			
			memory[m][n] = memory[m][n] ==  1 ? memory[m][n] : 0;   
			memory[m][n - 1] = memory[m][n - 1] ==  1 ? memory[m][n - 1] : 0;
			memory[m - 1][n] = memory[m - 1][n] ==  1 ? memory[m - 1][n] : 0;
			memory[m - 1][n - 1] = memory[m - 1][n - 1] ==  1 ? memory[m - 1][n - 1] : 0;
			
			result = false;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {

		Stream<String> boardStream = Arrays.stream(BOARD_SAMPLE_2);
		
		boolean result = false;
		do {
			
			result = inputValue(6, 6, BOARD_SAMPLE_2);
			convert(6, 6, BOARD_SAMPLE_2);
			
		}while(result);
		
		System.out.println();
		boardStream= Arrays.stream(BOARD_SAMPLE_2);
		boardStream.forEach(System.out::println);
		System.out.println();
		System.out.println("delete Count : " + deleteCount);
			
	}
}
