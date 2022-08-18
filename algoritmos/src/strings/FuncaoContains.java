package strings;

import java.util.Scanner;

public class FuncaoContains {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		if (texto.contains("janeiro")) {
			System.out.println("Texto contém a palavra janeiro.");
		}else {
			System.out.println("Texto não contém a palavra janeiro.");
		}
		s.close();
		

	}

}
