package strings;

import java.util.Scanner;

public class Buffer {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Se você entra com um número.");
		int n = s.nextInt();
		System.out.println("E depois ler um texto(pulou essa etapa))");
		String t = s.nextLine();
		System.out.println("conteudo de n = " + n);
		System.out.println("conteudo de t = " + t);
		System.out.println("O texto que é lido pelo nextLine é o <ENTER>");
		System.out.println("Para resolver esse problema é coloar um s.nextLine() entre o nextInt e o nextLine");
		
		
	}
}
