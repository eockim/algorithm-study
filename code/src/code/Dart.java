package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dart {
	
	static final String SAMPLE_1 = "1S2D*3T";
	static final String SAMPLE_2 = "1D2S#10S";
	static final String SAMPLE_3 = "1D2S0T";
	static final String SAMPLE_4 = "1S*2T*3S";
	static final String SAMPLE_5 = "1D#2S*3S";
	static final String SAMPLE_6 = "1T2D3D#";
	static final String SAMPLE_7 = "1D2S3T*";
	
	public static List<HashMap<String, Object>> scoreList = new ArrayList<HashMap<String, Object>>();
	
	public static List<String> toScoreList(String scoreString) {
		
		List<String> scoreList = new ArrayList<String>();
		 Matcher m = Pattern.compile("(\\d)+[S|T|D][*|#]*")
			     .matcher(scoreString);
		 
		while (m.find()) {
			scoreList.add(m.group());
		}
		
		return scoreList;
		
	}
	
	public static void setScoreMap(int index, String scoreString) {
		
		double score = 0;
		String type = "";
		Matcher m = null;
		
		HashMap<String, Object> scoreMap = new HashMap<String, Object>();
		
		m = Pattern.compile("(\\d)+")
			     .matcher(scoreString);

		while (m.find()) {
			score = Double.parseDouble( m.group() );
		}
		
		m = Pattern.compile("[S|T|D][*|#]*")
			     .matcher(scoreString);
		
		while (m.find()) {
			type =  m.group();
		}
		
		switch(type.substring(0, 1)) {
			
			case "S" : score = Math.pow(score, 1);
			break;
			case "D" : score = Math.pow(score, 2);
			break;
			case "T" : score = Math.pow(score, 3);
			default:
			break;
		
		}
		
		System.out.println((int)score);
		System.out.println(type.charAt(0));
		System.out.println(type.length() > 1 ? type.charAt(1) : "");
		
		scoreMap.put("score", (int)score);
		scoreMap.put("type", type.charAt(0));
		scoreMap.put("specialType", type.length() > 1 ? type.charAt(1) : "");

		scoreList.add(index, scoreMap);
		
	}
	
	public static void doubleScore(int index){
		
		for(int i = index; i > index - 1; --i) {
			System.out.println("dobule index : " + i);
			System.out.println("double score : " + (int)scoreList.get(i).get("score") );
			scoreList.get(i).put("score", (int)scoreList.get(i).get("score") * 2);
		}
		
	}
	
	public static void main(String[] args) {
		
		 List<String> score = toScoreList(SAMPLE_1);
		 int totalResult = 0;
		 
		for(int i = 0 ; i < score.size(); i++) {
			
			setScoreMap(i, score.get(i));
			
		}
		
		for(int i = 0; i < scoreList.size(); i++) {
			
			if(scoreList.get(i).get("specialType").toString().equals("#")) {
				
				System.out.println("minus");
				scoreList.get(i).put("score", (int)scoreList.get(i).get("score") * -1);
				
			}else if( scoreList.get(i).get("specialType").toString().equals("*") ){
				
				System.out.println("double");
				System.out.println("double index : " + i);
				doubleScore(i);
				
			}
			
		}
		
		for(int i = 0 ; i <scoreList.size(); i++) {
			
			System.out.println("each score : " + (int)scoreList.get(i).get("score"));
			totalResult += (int)scoreList.get(i).get("score");
		}
		
		System.out.println("total score : " + totalResult);
		
		
	}
}
