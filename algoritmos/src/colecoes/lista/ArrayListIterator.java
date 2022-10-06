package colecoes.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

	public static void main(String[] args) {
		List <Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("José"));
		clientes.add(new Cliente("Ana"));
		clientes.add(new Cliente("Pedro"));

		for(Iterator<Cliente> it = clientes.iterator();it.hasNext();) {
			Cliente temp = it.next();
			System.out.println(temp.getNome());
		}
		
		/*
		for(int i=0; i<clientes.size(); i++) {
			Cliente temp = clientes.get(i);
			System.out.println(temp.getNome());
		}
		*/
	}

}
