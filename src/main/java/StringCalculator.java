
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
/* hello*/
	private String testeDelim;

	private int pos;
	private String delims;
	private String reste;

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
					for (String totDigit : totDigits) {
						sum = sum + test1000(parseInt(totDigit));
					}

				} else {
					String delimi = "[,;\n]";
					String[] totDigits = number.split(delimi);
					for (String totDigit : totDigits) {
						sum = sum + parseInt(totDigit);
					}
				}
			} else if (number.length() == 1) {
				sum = parseInt(number);
			}

		} else if ("".equals(number)) {
			sum = 0;
		}

	}

	public int getSum() {
		return sum;
	}

	public int test1000(int numb) {
		int res;
		if (numb > 1000) {
			res = 1;
		} else {
			res = numb;
		}
		return res;
	}

}
