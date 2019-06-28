package teste;

import java.util.Arrays;
import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<String, Object> map = new Hashtable<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));

		System.out.println(map.contains("1"));// verifica se e valor mapeado para uma chave qualquer o mapa
		System.out.println(map.contains("2"));
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("A"));// verifica se e uma chave do mapa

		map.remove("A");// remove do mapa
		System.out.println(map);
	}

}
