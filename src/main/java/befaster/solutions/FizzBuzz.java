package befaster.solutions;


public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	String str = String.valueOf(number);
    		if(number%15==0 || (number%10==5 && number%10==3)) {
    			str= "fizz buzz";
    		}else if(number%5==0 || number%10==5) {
    			str = "buzz";
    		}else if(number%3==0 || number%10==3) {
    			str = "fizz";
    		}
    		
    		return str;
    }

}
