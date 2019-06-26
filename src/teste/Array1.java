package teste;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		int [] array = new int [5];
		array[0] = 1;
		
		int array2 [] = new int [5];
		array2[0] = 1;
		
		System.out.println(array[0]);
		System.out.println(array2[0]);
		
		System.out.println("");//espaco entre exemplo de arrays
		
		int [][] array3 = new int [5][1];
		array3 [0][0] = 1;
		
		String array4 [][] = new String [5][1];
		array4 [0][0] = "1";
		
		System.out.println(array3[0][0]);
		System.out.println(array4[0][0]);
		System.out.println("");
		
		System.out.println("toString:");
		int [] array5 = new int[5];
		array5 [0] = 1;
		array5 [1] = 2;
		array5 [2] = 3;
		array5 [3] = 4;
		array5 [4] = 5;
		
		System.out.println(array5);
		System.out.println(Arrays.toString(array5));
		System.out.println("");
		
		System.out.println("Ordem ascendente:");
		int [] array6 = new int[5];
		array6 [0] = 1;
		array6 [1] = 3;
		array6 [2] = 5;
		array6 [3] = 2;
		array6 [4] = 4;
		
		Arrays.sort(array6);
		
		System.out.println(Arrays.toString(array6));
		System.out.println("");
		
		System.out.println("copyOfRange:");
		int [] array7 = new int [5];
		
		array7 [0] = 1;
		array7 [1] = 2;
		array7 [2] = 3;
		array7 [3] = 4;
		array7 [4] = 5;
		
		int [] newArray = Arrays.copyOfRange(array7, 1, 3);
		
		System.out.println(Arrays.toString(newArray));
	}

}
