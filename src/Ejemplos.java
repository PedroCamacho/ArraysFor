
public class Ejemplos {

	private void imprimir(int[] arrayEjemplo) {
		for (int i = 0; i < arrayEjemplo.length; i++) {
			System.out.print(arrayEjemplo[i] + " ");
		}
		System.out.println("");
	}
	
	private int sumaTotal(int[] arrayEjemplo) {
		int suma = 0;
		for (int i = 0; i < arrayEjemplo.length; i++) {
			suma = suma + arrayEjemplo[i];
		}
		return suma;
	}
	
	private int mayor(int[] arrayEjemplo) {
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < arrayEjemplo.length; i++) 
			if(mayor<arrayEjemplo[i])
				mayor = arrayEjemplo[i];
		return mayor;
	}
	
	public static void main(String[] args) {

		//Inicializacion
		int [] arrayEjemplo = {2,5,1,3,4};
		Ejemplos programa = new Ejemplos();
		int suma=0;
		int mayor=0;

		//Proceso y Salida
		programa.imprimir(arrayEjemplo);
		suma = programa.sumaTotal(arrayEjemplo);
		mayor = programa.mayor(arrayEjemplo);
		System.out.println("La suma de los números es: " + suma);
		System.out.println("El mayor de los números es: " + mayor);
		
	}














}
