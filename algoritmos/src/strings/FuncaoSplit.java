package strings;

import java.util.Scanner;

public class FuncaoSplit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		System.out.println("Texto original = " + texto);
		//processar data
		String partes[] = texto.split(" ");
		//System.out.println("Dia " + partes[0]);
		for(int i=0; i < partes.length; i++) {
			System.out.println("Parte[" + i + "] = " + partes[i]);
		}
		s.close();

	}

}
