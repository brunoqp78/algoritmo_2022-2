package strings;

import java.util.Scanner;

public class FuncaoReplace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		String novo = texto.replace("uftm", "iftm");
		String trat = texto.replace(",", "");
		trat = trat.replace(".", "");
		String partes[] = trat.split(" ");
		System.out.println("Texto original = " + texto);
		System.out.println("Texto novo = " + novo);
		System.out.println("Texto com tratamento = " + trat);
		for(int i=0; i < partes.length; i++) {
			System.out.println("Parte[" + i + "] = " + partes[i]);
		}
		int numero = 10;
		Integer numero2 = 10;
		s.close();
		
		

	}

}
