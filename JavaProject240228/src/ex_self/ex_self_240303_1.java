package ex_self;
import java.text.DecimalFormat;
public class ex_self_240303_1 {
	

	
	    public static void main(String[] args) {
	        double randomNumber = Math.random();
	        
	        // 소수점 두 자리까지만 출력하기 위해 DecimalFormat을 사용합니다.
	        DecimalFormat df = new DecimalFormat("#.##");
	        String formattedNumber = df.format(randomNumber);
	        
	        System.out.println("Random number with two decimal places: " + formattedNumber);
	    }
	}