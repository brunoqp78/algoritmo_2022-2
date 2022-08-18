package strings;

import java.util.Scanner;

public class FuncaoIndexOf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		System.out.println("Texto original = " + texto);
		String tp = "udi";
		System.out.println("Primeira ocorrencia de " + tp + " esta em " + texto.indexOf(tp));
		System.out.println("Primeira ocorrencia de " + tp + " após o 12 caractere esta em " + texto.indexOf(tp, 12));
		System.out.println("Primeira ocorrencia de " + tp + " na última parte do texto esta em " + texto.indexOf(tp, texto.length()/2));
		System.out.println("Ultima ocorrencia de " + tp + " no texto esta em " + texto.lastIndexOf(tp));
		System.out.println("Não encontrei o texto, retorna " + texto.lastIndexOf("uberaba"));
		System.out.println("primeira ocorrencia da letra a = " + texto.indexOf('a'));
	}

}
