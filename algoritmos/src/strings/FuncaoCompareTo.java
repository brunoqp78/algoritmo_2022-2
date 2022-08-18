package strings;

import java.util.Scanner;

public class FuncaoCompareTo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto1 = s.nextLine();
		String texto2 = s.nextLine();
		
		if (texto1.compareTo(texto2) == 0) {
			System.out.println("São iguais");
		}else if (texto1.compareTo(texto2) < 0) {
			System.out.println("texto1 menor que texto2");
		}else if (texto1.compareTo(texto2) > 0) {
			System.out.println("texto1 maior que texto2");
		}
	}
}
