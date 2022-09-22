package colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListContains {

	public static void main(String[] args) {
		List <String> clientes = new ArrayList<>();
		clientes.add("Pedro");
		clientes.add("Pedro");
		clientes.add("José");
		clientes.add("Pedro");
		clientes.add("Pedro");
		
		clientes.add("Ana");
		clientes.add("Pedro");
		clientes.add("Paulo");
		clientes.add("Pedro");
		clientes.add("Ana");
		
		if (clientes.contains("Paulo")) {
			System.out.println("A lista contém a palavra Paulo");
		}else {
			System.out.println("Não contém a palavra Paulo");
		}
		
		List<String> lp = new ArrayList<String>();
		lp.add("Paulo");
		lp.add("Pedro");
		if (clientes.containsAll(lp)) {
			System.out.println("A lista contém as palavras");
		}else {
			System.out.println("Não contém as palavras");
		}
		
		
	}

}
