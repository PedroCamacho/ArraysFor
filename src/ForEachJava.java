
public class ForEachJava {

	public static void main(String[] args) {
		//Inicializacion
		int [] arrayEjemplo = {1,2,3,7,5};
		boolean estaOrdenado = true;
		
		//Proceso: �Est� ordenado?
		int anterior = Integer.MIN_VALUE;
		for (int i : arrayEjemplo) {
			if (anterior>i)
				estaOrdenado=false;
			anterior = i;
		}
		
		//Salida
		if (estaOrdenado)
			System.out.println("Est� ordenado");
		else
			System.out.println("NO est� ordenado");

	}

}
