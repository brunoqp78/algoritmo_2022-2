package strings;

public class FuncaoSubString {

	public static void main(String[] args) {
		String texto = "Iftm Uberlandia";
		System.out.println(texto.substring(texto.length()-2, texto.length()));
		System.out.println(texto.substring(texto.length()-4));
		String novaString = texto.substring(0, 2);

	}

}
