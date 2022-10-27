package colecoes.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import colecoes.lista.Cliente;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, String> mapa1 = new HashMap<>(); 
		HashMap<String, String> mapa2 = new HashMap<>();
		
		//chave será o nome do municipio e o valor o código ddd
		Map<String, String> dddPorMunicipio = new HashMap<>();
		dddPorMunicipio.put("Niterói", "11");
		dddPorMunicipio.put("Rio de Janeiro", "11");
		dddPorMunicipio.put("Rio Verde", "64");
		dddPorMunicipio.put("Uberlândia", "44");
		dddPorMunicipio.put("Uberlândia", "34");
		dddPorMunicipio.put("Uberaba", "34");
		
		String cidade = s.nextLine();
		System.out.println(dddPorMunicipio.getOrDefault(cidade, "Não achou"));
		
		/*
		for (Map.Entry<String, String> elemento : dddPorMunicipio.entrySet()) {
			System.out.println(elemento.getKey() + " - " + elemento.getValue());
		}
		*/
		
	}

}
