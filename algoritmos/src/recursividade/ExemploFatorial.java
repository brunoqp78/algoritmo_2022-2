package recursividade;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExemploFatorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(fat(10000));

	}
	
	public static BigInteger fat(int n) {
		if(n == 0) {
			return new BigInteger("1");
		}else {
			return fat(n-1).multiply(new BigInteger(String.valueOf(n)));
		}
		
	}

}
