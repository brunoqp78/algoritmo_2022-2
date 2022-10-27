package colecoes.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import colecoes.lista.Cliente;

public class Exemplo01 {

	public static void main(String[] args) {
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
		
		//percorrer todo o mapa considerando a dupla(chave, valor)
		for (Map.Entry<String, String> elemento : dddPorMunicipio.entrySet()) {
			System.out.println(elemento.getKey() + " - " + elemento.getValue());
		}
		
		//percorrer todo o mapa considerando os valores
		for(String ddd: dddPorMunicipio.values()) {
			System.out.println(ddd);
		}
		
		//percorrer todo o mapa considerando as chaves
		for(String municipio : dddPorMunicipio.keySet())
		{
			System.out.println(municipio);
		}
		
		
		Map<String, Collection<String>> municipiosPorDDD = new HashMap<>();
		Collection <String> cidades = new ArrayList<>();
		cidades.add("Uberlândia");
		cidades.add("Uberaba");
		municipiosPorDDD.put("34", cidades);
		
		Map<Integer, Cliente> mapa3 = new HashMap<>();
		
		mapa3.put(100, new Cliente("111111", "Jose"));
		
		Map<Object, Object> mapa4 = new HashMap<>();
		mapa4.put(100, new Cliente("111111", "Jose"));

	}

}
