package colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIndexEmptyClear {

	public static void main(String[] args) {
		List<String> clientes = new ArrayList<>();
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
		
		clientes.clear();
		if (clientes.isEmpty()) System.out.println("Lista vazia");
		
		int pos = clientes.indexOf("Paulo");
		if (pos < 0)
			System.out.println("Paulo não existe na lista");
		else if (pos < clientes.size() / 2) {
			System.out.println("Paulo existe na primeira metade da lista");
		} else {
			System.out.println("Paulo existe na segunda metade da lista");
		}
		System.out.println(pos);

	}

}
