import java.util.Scanner;

public class SacandoConsonantes {
    
    public static void main(String[] args) {
        /**
         * Para resolverlo, seguiremos estos pasos
         * 1.- Convertir la frase en un array de char para trabajar mejor con ella
         * 2.- Recorremos el array de caracteres, buscamos aquellos caracteres que no son vocales
         * 3.- incrementamos un contador cada vez que encuentro una consonante
         * 4.- Este contador me dirá el tamaño que ha de tener la frase sin vocales
         * 5.- Creo un array de tamaño al contador
         * 6.- Vuelvo a recorrer la frase original, cada vez que encuentro una consonante, la meto en el nuevo array
         */

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = sc.nextLine();
		
		char[] array = frase.toLowerCase().toCharArray(); // transforma frase a array de char (en minúscula)
		int contador = 0; // contador de consonantes
		
		System.out.println("Frase original:\n" + frase);
		for (int i = 0; i < array.length; i++) { // recorro el array
			// si no es una vocal, incremento contador
			if (array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u')
				contador++;
		}
		System.out.println();
		
		// si el contador es 0, no hay vocales, termina el programa
		if(contador == 0) {
			System.out.println("La frase no tiene vocales");
		} else {
			char result [] = new char[contador]; // creo un nuevo array de tamaño contador
			
			int b = 0; // variable que usaré de puntero para los índices del array pequeño
			for (int i = 0; i < array.length; i++) {
                // si encuentro una consonante, la meto en el array e incremento el puntero
				if (array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u') {
					result[b] = frase.charAt(i);
					b++;
				}
			}
			System.out.println("Array resultante");
			//System.out.println(Arrays.toString(result));
			// imprimo el array resultante
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
		}
		
		sc.close();
    }
}
