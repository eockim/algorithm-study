package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TryHelloWorld2
{
    public String getDayName(int a, int b)
    {
    	 SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY mm dd") ;
    	 Date nDate;
    	 int dayNum = 0;
    	 String day = "";
		try {
			nDate = dateFormat.parse("2016 " + a +" " + b);
			 Calendar cal = Calendar.getInstance() ;
	    	 cal.setTime(nDate);
	    	 
	    	 dayNum = cal.get(Calendar.DAY_OF_WEEK);
	    	 
	    	 switch(dayNum){
	         case 1:
	             day = "SUN";
	             break ;
	         case 2:
	             day = "MON";
	             break ;
	         case 3:
	             day = "TUE";
	             break ;
	         case 4:
	             day = "WED";
	             break ;
	         case 5:
	             day = "THU";
	             break ;
	         case 6:
	             day = "FRI";
	             break ;
	         case 7:
	             day = "SAT";
	             break ;
	              
	     }

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	     
    	 return day;
    }
    public static void main(String[] args)
    {
        TryHelloWorld2 test = new TryHelloWorld2();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
