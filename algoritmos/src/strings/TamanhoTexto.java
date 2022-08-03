package strings;

import java.util.Scanner;

public class TamanhoTexto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String texto = s.nextLine();
		
		System.out.println(texto.length());
		
		s.close();

	}

}
