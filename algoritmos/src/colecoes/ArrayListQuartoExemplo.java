package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListQuartoExemplo {

	public static void main(String[] args) {		
		ArrayList<String> l = new ArrayList<>();
		l.add("Bruno");
		l.add("Jose");
		l.add("Pedro");
		
		for(int i=0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

}
