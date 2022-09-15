package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListTerceiroExemplo {

	public static void main(String[] args) {		
		ArrayList l1 = new ArrayList();
		l1.add("Bruno");
		System.out.println(l1);
		l1.add("Jose");
		System.out.println(l1);
		l1.add("Joao");
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList();
		l2.add(1);
		l2.add(2);
		
		ArrayList l3 = new ArrayList();
		l3.add("Texto");
		l3.add(1);
		l3.add(1.0);
		l3.add('c');
		l3.add(new Cliente("Bruno"));
		
		ArrayList<String> l4 = new ArrayList<String>();
		l4.add("Bruno");
		l4.add("1");
		
		ArrayList<Integer> l5 = new ArrayList<>();
		l5.add(426);
		

	}

}
