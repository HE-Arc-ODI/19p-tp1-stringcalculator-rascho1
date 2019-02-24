
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
	private int teste;

	public StringCalculator(String number) {

		if (!" ".equals(number)) {
			if (number.length() >= 2) {
				testeDelim = number.substring(0, 2);

				if (testeDelim.equals("//")) {
					pos = number.indexOf("\n");
					delims = number.substring(2, pos);

					reste = number.substring(pos + 1);
					String numbers = reste.replace(delims, ";");
				
					String delimi = "[;]";

					String[] totDigits = numbers.split(delimi);
					for (int i = 0; i < totDigits.length; i++) {
					/*	 teste = parseInt(totDigits[i]);
						if (teste >1000){
							sum = sum+1;
						}else{*/
						sum = sum + test1000(parseInt(totDigits[i]));
					}
					

				} else {
					String delimi = "[,;\n]";
					String[] totDigits = number.split(delimi);
					for (int i = 0; i < totDigits.length; i++) {
						sum = sum + parseInt(totDigits[i]);
					}
				}
			} else if (number.length() == 1) {
				sum = parseInt(number);
			}

		}  else if ("".equals(number)) {
			sum = 0;
		}

	}

	public int getSum() {
		return sum;
	}
	public int test1000(int numb){
		int res;
	if (numb>1000){
		res = 1;
	}
	else{ res=numb;
	}
	return res;
	};

/*	public static void main(String[] args) {
		String teste2 = "Bonjo.ur les";
		String teste1 = teste2.substring(5 + 1);
		int post = teste2.indexOf(".");
		String teste3 = teste2.substring(5 + 1);
		int posisi = teste2.indexOf("B");

		System.out.println(teste1);
		System.out.println(post);

	}*/
}
