package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayList1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		list.add('C');
		list.add(2);
		
		list.removeIf(new Predicate<Object>() {

			@Override
			public boolean test(Object n) {
				// TODO Auto-generated method stub
				return n instanceof Integer;
			}
		});
		
		list.removeIf(n -> (n instanceof String));
		
		System.out.println(list);
	}

}
