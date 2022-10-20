package colecoes.conjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetExemplo01 {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		Collection<String> lista3 = new ArrayList<>();
		
		HashSet<String> conjunto1 = new HashSet<>();
		Set<String> conjunto2 = new HashSet<>();
		Collection<String> conjunto3 = new HashSet<>();
		
		Random gerador = new Random();
		String texto = String.valueOf((int)(gerador.nextDouble()*10)+1);
		
		//System.out.println(conjunto2 instanceof HashSet);
		for (int i = 0; i < 30; i++) {
			lista2.add(texto);
			if (!conjunto2.add(texto)) {
				System.out.println("Núme'ro já existe!!!");
			}
			texto = String.valueOf((int)(gerador.nextDouble()*10)+1);
		}
		System.out.println("Saída Lista: ");
		for(String t : lista2) {
			System.out.println(t);
		}
		
		System.out.println("Saída Conjunta: ");
		for(String t : conjunto2) {
			System.out.println(t);
		}
	}

}
