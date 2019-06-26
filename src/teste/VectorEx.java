package teste;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class VectorEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		list.add(1);
		list.add("A");
		list.add("B");

		System.out.println(list.isEmpty());// verifica se esta vazio

		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));// converta para array

		list.clear();// limpa a lista

		System.out.println(list);

	}
}
