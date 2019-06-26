package teste;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		list.add(1);
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.remove("B");//remove
	
		
		System.out.println(list.contains("A"));//identifica se existe esse valor
		System.out.println(list);//imprime a lista
		System.out.println(list.size());//tamanho na lista
	}
	

}
