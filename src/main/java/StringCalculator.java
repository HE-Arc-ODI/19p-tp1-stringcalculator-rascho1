
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
	private int sum = 0;
	private int longu;
	private String testeDelim;
	private String endDelim;
	private int pos;
	private String delims;
	private String reste;
	
	public StringCalculator(String number){
	
	
	if (!" ".equals(number)){
		if (number.length()>=2){
			testeDelim = number.substring(0,2);
			
			
				 if (testeDelim.equals("//")){
						pos = number.indexOf(" ");
						delims = number.substring(2,pos);	
						reste = number.substring(pos+1);
						
						String delimi = "[delims]";
						String[] totDigits = reste.split(delimi);
						for (int i = 0; i < totDigits.length; i++) {
							sum = sum+ parseInt(totDigits[i]);	
							}
						
					} else {
						String delimi = "[,;\n]";
						String[] totDigits = number.split(delimi);
						for (int i = 0; i < totDigits.length; i++) {
							sum = sum + parseInt(totDigits[i]);	
							}}}
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

public static void main(String[] args) {
		String teste2 = "Bonjour les";
		int post = teste2.indexOf(" ");
		String teste3 = teste2.substring(post+1);
		int posisi = teste2.indexOf("B");
		
		System.out.println(teste3);
	}
}
