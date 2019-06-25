package teste;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		Integer i = new Integer (125);
		Integer j = i;
		
		System.out.println(i==j);
		
		i++;
		
		System.out.println("i = " + i);
		System.out.println(i==j);
	}

}
