package teste;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutIfBoundsException {

	public static void main(String[] args) {
		List<String> meuArray = new ArrayList<String>();
		meuArray.add("Valor 001");
		meuArray.add("Valor 002");
		meuArray.add("Valor 003");
		meuArray.add("Valor 004");
		meuArray.add("Valor 005");

		meuArray.get(-1);

	}
}
