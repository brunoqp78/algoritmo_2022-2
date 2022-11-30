package recursividade;

import java.util.Scanner;

public class ExemploFibo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(fibonacci(3));

	}
	
	public static long fibonacci(int n) {
		if(n <= 1) {
			return n;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
		
	}

}
