package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStr {
	
	public String reverseStr2(String str) {
		
		String[] array = str.split("");
	    Arrays.sort(array);
	    
	    Collections.reverse(Arrays.asList(array));
	   
	    return  String.join("",array);
		
	}
	
	public String reverseStr(String str){
					
		return Stream.of(str.split(""))
				.sorted(Collections.reverseOrder())
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("ZbcdefsvcAdfwddssbxbcbwbwewebwebwebefQDVwvSaabghrbetnrtynmsadgeerRAFGFDBVCBAawrgnrmrmlgjoeraashyiIDvdWDascccg") );
	}
}