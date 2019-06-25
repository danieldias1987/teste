package teste;

public class Book {
	
	private String isbn;//atributo string
	
	public Book(String isbn) {//construtor parametrizado, para construir pelo compilador lado direito /surce /Genaration Construtor using Filds
		
		this.isbn = isbn;// atencao ao .this
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}


	public static void main(String[] args) {//criacao metodo main
		
		Book book1 = new Book("book1");//instancia book1
		Book book2 = new Book("book1");//instancia book2
		
		System.out.println(book1.equals(book2));
	}
	
}
