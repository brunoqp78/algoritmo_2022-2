package colecoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove1 {

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
		
		clientes.remove(4);
		clientes.remove("Pedro");
		//código abaixo permite apagar todas as ocorrências de várias palavras/objetos
		//List <String> p = new ArrayList<>();
		//p.add("Pedro");
		//p.add("Ana");
		//clientes.removeAll(p);
		
		for(Iterator<String> it = clientes.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
	}

}
