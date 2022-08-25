package strings;

public class ClasseStringBuilder {

	public static void main(String[] args) {
		//formas de criar/instanciar textos/objetos da classe String Builder
		StringBuilder texto1 = new StringBuilder();
		StringBuilder texto2 = new StringBuilder("Texto original - ");
		texto1.append("texto inserido no fim");
		texto1.append(".");
		texto1.insert(0, "TEXTO: ");
		texto1.delete(0, 5);
		texto1.deleteCharAt(texto1.length()-1);
		
		System.out.println(texto1);
		System.out.println(texto2);
		

	}

}
