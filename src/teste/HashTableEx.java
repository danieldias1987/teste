package teste;

import java.util.Arrays;
import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<String, Object> map = new Hashtable<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));

		System.out.println(map.contains("1"));
		System.out.println(map.containsKey("A"));

		map.remove("A");
		System.out.println(map);
	}

}
