
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
	private String testeDelim;
	private String endDelim;
	private int pos;
	private String delims;
	
	public StringCalculator(String number){
	
	
	if (!"".equals(number)){
		if (number.length()>1){
			testeDelim = number.substring(2);
			
			
				 if (!testeDelim.equals("//")){
				 delims = "[,;\n]";
					} else {
			
						pos = number.indexOf('\n');
						/*if (pos > -1){*/
						delims = number.substring(2,pos);}
						String delimi = "[delim]";
						String[] totDigits = number.split(delimi);
						for (int i = 0; i < totDigits.length; i++) {
							sum = sum+ parseInt(totDigits[i]);	
							}}
		else if (number.length()==1){
				sum = parseInt(number);
			}
		
		
	}
	/*	String delims = "[,;\n]";
		String[] totDigits = number.split(delims);
		for (int i = 0; i < totDigits.length; i++) {
			sum = sum+ parseInt(totDigits[i]);
			
		}*/
	

	else if ("".equals(number)){
		sum =0;
	}
		
	
	}
	
public int getSum(){
	return sum;
}
}
