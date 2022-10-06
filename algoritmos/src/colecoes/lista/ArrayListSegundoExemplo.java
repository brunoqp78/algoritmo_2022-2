package colecoes.lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListSegundoExemplo {

	public static void main(String[] args) {
		//Criação de uma instancia generica de lista
		List<String> l = new ArrayList<String>();
		l = new LinkedList<>();
		l = new Vector<>();
		//criação de uma instancia de um ArrayList
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Bruno");
		System.out.println(l1);
		l1.add("Jose");
		System.out.println(l1);
		l1.add("Joao");
		System.out.println(l1);

	}

}
