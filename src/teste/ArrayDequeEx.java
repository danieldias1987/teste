package teste;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayDeque queue = new ArrayDeque<>();

		queue.addFirst(new Pessoa("Antonio", 32));
		queue.addFirst(new Pessoa("Fabio", 25));
		queue.addFirst(new Pessoa("Joao", 16));
		queue.addFirst(new Pessoa("Jose", 32));
		queue.addFirst(new Pessoa("Maria", 10));

		System.out.println(queue.peek());
		System.out.println(queue.getLast());
		System.out.println(queue.getFirst());

	}

}
