package befaster.solutions;


public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    		if(number%15==0) {
    			str= "fizz buzz";
    		}else if(number%5==0) {
    			str = "buzz";
    		}else if(number%3==0) {
    			str = "buzz";
    		}
    		
    		return str;
    }

}
