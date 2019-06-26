package teste;

import java.util.TreeSet;

public class TreeSetEx {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet set = new TreeSet<>();

		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(600);

		System.out.println(set.headSet(300));
		System.out.println(set.tailSet(300));
		System.out.println(set.subSet(100, 450));
	}

}
