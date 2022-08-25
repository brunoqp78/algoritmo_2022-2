package strings;

import javax.swing.JOptionPane;

public class RegexUm {
	// public static final String EXPRESSAOCEP = "\\d\\d\\d\\d\\d-\\d\\d\\d";
	// public static final String EXPRESSAODATA = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
	public static final String EXPRESSAOCEP = "\\d{5}-\\d{3}";
	public static final String EXPRESSAODATA = "\\d{2}/\\d{2}/(\\d{2}|\\d{4})";
	private static final String EXPRESSAOEMAIL = "\\w{2,}@\\w{0,100}\\.?\\w{2,100}\\.\\w{2,3}\\.?\\w{0,3}";
	private static final String EXPRESSAOEMAILCOMBR = "\\w{2,}@\\w{2,100}\\.?\\w{0,3}\\.br$";

	public static void main(String[] args) {
		String texto = "Iftm";
		// sem utilizar caracteres especiais
		System.out.println(texto.matches("Iftm"));

		// utilizando o caracter .
		texto = "Iftm aaaa";
		System.out.println(texto.matches("Iftm ...."));

		// utilizando o caracter \d
		texto = "Iftm 2022";
		System.out.println(texto.matches("Iftm \\d\\d\\d\\d"));

		// utilizando o caracter \w \d
		texto = "A2";
		System.out.println(texto.matches("\\w\\d"));

		// utilizando o caracter \w \d
		texto = "A 2";
		System.out.println(texto.matches("\\w\\s\\d"));

		// exemplo 01 - validação de cep
		texto = "38400-000";
		System.out.println(texto.matches(EXPRESSAOCEP));

		// exemplo 01 - validação de data
		texto = "09/06/21";
		System.out.println(texto.matches(EXPRESSAODATA));

		// exemplo .* validando a ocorrencia de uma data no interior de uma frase
		texto = "No dia 09/06/21 ocorreu blablabla";
		System.out.println(texto.matches(".*" + EXPRESSAODATA +".*"));

		// exemplo de validação de e-mail
		texto = "joao@estudante.iftm.edu.br";
		System.out.println(texto.matches(EXPRESSAOEMAIL));
	}

}
