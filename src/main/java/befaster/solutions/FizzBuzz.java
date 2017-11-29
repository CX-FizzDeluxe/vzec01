package befaster.solutions;


public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    Boolean containsBoth = false;
    
    if(String.valueOf(number).contains("5") && String.valueOf(number).contains("3")) {
		str = "fizz buzz";
		containsBoth = true;
	}
    		if(number%15==0) {
    			str= "fizz buzz"; 
    			
    		}else if((number%5==0 || String.valueOf(number).contains("5")) && containsBoth) {
    			str = "buzz";
    		}else if((number%3==0 || String.valueOf(number).contains("3")) && containsBoth) {
    			str = "fizz";
    		}
    		
    		return str;
    }

}
