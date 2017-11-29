package befaster.solutions;


public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    	boolean fizzBuzz = false;
    		if(number%15==0 || (number%10==5 && number%10==3)) {
    			str= "fizz buzz";
    			fizzBuzz = true;
    		}else if((number%5==0 || number%10==5) && !fizzBuzz) {
    			str = "buzz";
    		}else if((number%3==0 || number%10==3) && !fizzBuzz) {
    			str = "fizz";
    		}
    		
    		return str;
    }

}
