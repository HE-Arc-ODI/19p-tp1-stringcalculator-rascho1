
import static java.lang.Integer.parseInt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raphael.schoeni
 */
public class StringCalculator {
	private int sum;
	private int longu;
	
	public StringCalculator(String number){
	
	
	if (!"".equals(number)){
		longu = String.valueOf(number).length();
		if (longu == 1) {
			sum=parseInt(number);
		}
			else if ("".equals(number)){
		sum =0;
	}
		
			
		}
	}

	
	
	
	
public int getSum(){
	return sum;
}
	
}
