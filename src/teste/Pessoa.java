package teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return o.getIdade().compareTo(getIdade());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Queue queue = new PriorityQueue<>(new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				// TODO Auto-generated
				return o2.getIdade().compareTo(o1.getIdade());
			}
		});

		// Queue queue = new PriorityQueue<>();
		queue.add(new Pessoa("Antonio", 32));
		queue.add(new Pessoa("Fabio", 25));
		queue.add(new Pessoa("Joao", 16));
		queue.add(new Pessoa("Jose", 32));
		queue.add(new Pessoa("Maria", 10));

		System.out.println(queue.peek());

	}
}
