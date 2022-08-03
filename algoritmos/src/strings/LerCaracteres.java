package strings;

import java.util.Scanner;

public class LerCaracteres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		if (texto.length()>=2) {
			System.out.println(texto.charAt(0) + "-" + texto.charAt(1));
		}
		else {
			System.out.println("Texto inválido.");
		}
		scanner.close();
	}

}
