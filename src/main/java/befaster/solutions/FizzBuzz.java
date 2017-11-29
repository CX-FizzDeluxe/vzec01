package befaster.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    boolean fizz = false;
    boolean buzz = false;
    boolean deluxe = false;
   
    		if(number%15==0) {
    			str= "fizz buzz"; 
    			
    		} if(number%5==0 || String.valueOf(number).contains("5")) {
    			str = "buzz";
    			buzz = true;
    		} if(number%3==0 || String.valueOf(number).contains("3")) {
    			str = "fizz";
    			fizz= true;
    		}
    		if((String.valueOf(number).contains("5") && String.valueOf(number).contains("3"))) {
    			str = "fizz buzz";
    		}
    		if (fizz==true && buzz==true) {
    			str = "fizz buzz";
    		}
    		if(number>10 && Pattern.matches("^([0-9])\\"+String.valueOf(number).split("")[0]+"*$", String.valueOf(number))) {
    			str = "deluxe";
    			deluxe = true;
    			
    		}
    		if(fizz && buzz && deluxe) {
    			str = "fizz buzz deluxe";
    		}
    		
    		return str;
    }

}
