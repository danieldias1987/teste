package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Arrayteste {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		
		
		list.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object n) {
				// TODO Auto-generated method stub
				System.out.println(n);
			}
		});
		
		list.forEach(n -> System.out.println(n));
	}

}
