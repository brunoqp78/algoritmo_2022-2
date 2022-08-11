package strings;

public class ASC {

	public static void main(String[] args) {
		//slide 3
		char caractere = 'a';
		System.out.println("Caractere " + caractere);
		caractere -=32;
		System.out.println("Caractere " + caractere);

		String texto = "iftm udi centro";
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c!=' ') {
				c-=32;
			}
			System.out.print(c);			
		}
		System.out.println();
		//função que faz a conversão para maiusculo
		System.out.println(texto.toUpperCase());
		
		System.out.println('a' - 'A');
		
	}

}
