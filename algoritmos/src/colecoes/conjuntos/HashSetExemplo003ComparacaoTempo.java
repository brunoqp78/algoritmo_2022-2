package colecoes.conjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetExemplo003ComparacaoTempo {

	public static void main(String args[]) {
		Collection<Integer> colecao = new HashSet<>();
		//Collection<Integer> colecao = new ArrayList<>();

		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 30000000; i++) { 	      colecao.add(i); 	    }

		for (int i = 0; i < 3000; i++) { 	      colecao.contains(i);  }

		long tempoFinal = System.currentTimeMillis();
		System.out.println(((tempoFinal-tempoInicial) / 1000.0) + " segundos" );
	}
}
