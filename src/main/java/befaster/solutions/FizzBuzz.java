package befaster.solutions;


public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    boolean fizz = false;
    boolean buzz = false;
    
   
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
    		
    		return str;
    }

}
