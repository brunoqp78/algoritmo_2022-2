package colecoes.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListQuintoExemplo {

	public static void main(String[] args) {		
		ArrayList<Cliente> l = new ArrayList<>();
		l.add(new Cliente("Bruno"));
		l.add(new Cliente("Jose"));
		l.add(new Cliente("Pedro"));
		
		//Collections.reverse(l);
		for(int i=l.size()-1; i >=0; i--) {
			System.out.println((l.get(i)).getNome());
		}

	}

}
