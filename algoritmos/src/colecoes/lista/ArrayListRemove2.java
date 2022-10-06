package colecoes.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove2 {

	public static void main(String[] args) {
		List <Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("José"));
		Cliente p = new Cliente("Pedro");
		clientes.add(p);
		clientes.add(new Cliente("1111", "Ana"));
		clientes.add(new Cliente("2111", "Pedro"));
		clientes.add(new Cliente("3111", "Paulo"));
		
		//clientes.remove(4);
		//clientes.remove(p);
		clientes.remove(new Cliente("3111", ""));
		
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
