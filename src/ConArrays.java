import java.util.*;
public class ConArrays{
	public static void main(String a[]) throws Exception {
		// Declaro un vector inicial
		int [] miVector={11,80,66,8,9};

		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
		
		// Ordenación del vector
		Arrays.sort(miVector);

		// Busco un elemento en concreto en un vector orde-nado
		System.out.println(Arrays.binarySearch(miVector, 11));
		
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
	}
}
