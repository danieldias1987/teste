package teste;

import java.util.Arrays;
import java.util.Comparator;

public class Pai /*implements Comparable<Pai>*/{
	
	private Integer id;
		
	public Pai (Integer id) {
	
		super();
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	
	/*@Override
	public int compareTo(Pai otherPai) {
		// TODO Auto-generated method stub
		return id.compareTo(otherPai.getId());
	}*/
	

	@Override
	public String toString() {
		return "Pai [id=" + id + "]";
	}

	public static void main(String[] args) {
		
		Pai[] array = new Pai [5];
		array[0] = new Pai (1);
		array[1] = new Pai (2);
		array[2] = new Pai (3);
		array[3] = new Pai (4);
		array[4] = new Pai (5);
		
		Arrays.sort(array, new Comparator<Pai>() {

			@Override
			public int compare(Pai o1, Pai o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
			
		});
		
		System.out.println("");
		System.out.println(Arrays.toString(array));
	}
}


