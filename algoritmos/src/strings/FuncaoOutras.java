package strings;

import java.util.Scanner;

public class FuncaoOutras {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto1 = s.nextLine();
		String texto2 = s.nextLine();
		if (texto1.startsWith(texto2)) {
			System.out.println("Texto1 começa com o texto2");
		}
		if (texto1.endsWith(texto2)) {
			System.out.println("Texto1 termina com o texto2");
		}

	}

}
