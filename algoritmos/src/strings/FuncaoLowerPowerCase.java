package strings;

import java.util.Scanner;

public class FuncaoLowerPowerCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto1 = s.nextLine();
		String texto2 = s.nextLine();
		
		System.out.println(texto1.toUpperCase());
		System.out.println(texto1);
		System.out.println(texto1.toLowerCase());
		System.out.println(texto1);
		
		//textos abaixo são similares
		if (texto1.toUpperCase().contains(texto2.toUpperCase())) {
			System.out.println("Texto1 igual a texto2");
		}
		
		String nova1 = texto1.toUpperCase();
		String nova2 = texto2.toUpperCase();
		if (nova1.contains(nova2)) {
			System.out.println("Texto1 igual a texto2");
		}

	}

}
