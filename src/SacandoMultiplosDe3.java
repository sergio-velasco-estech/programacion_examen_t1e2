import java.util.Arrays;
import java.util.Random;

public class SacandoMultiplosDe3 {
    public static void main(String[] args) {
        /**
         * Para resolverlo, seguiremos estos pasos
         * 1.- Crear un array de números aleatorios e imprimrlo
         * 2.- Recorremos el array de números, buscamos aquellos números múltiplos de 3
         * 3.- incrementamos un contador cada vez que encuentro múltiplo de 3
         * 4.- Este contador me dirá el tamaño que ha de tener el array de múltiplos de 3
         * 5.- Creo un array de tamaño al contador
         * 6.- Vuelvo a recorrer la el array inicial, cada múltiplo de 3 que encuentre lo metemos en el array pequeño
         */

        int[] array = new int[20];

		Random rnd = new Random();
		int contador = 0;
		
        // uso el mismo bucle para llenar el array con un número random y
        // comprobar si ese número es múltiplo de 3
		System.out.println("Array original");
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100) + 1; // número random para array
			System.out.print(array[i] + ", ");
			
			if (array[i] % 3 == 0) // si el número en esta posición es múltiplo de 3, incremento contador
				contador++;
		}
		System.out.println();
		
		
		if(contador == 0) { // si no hay múltiplos de 3, termina el programa
			System.out.println("No hay n�meros m�ltiplos de 3");
		} else {
			int result [] = new int[contador]; // creo el array de múltiplos de 3
			
			int b = 0; // variable que usaré de puntero para los índices del array pequeño
			for (int i = 0; i < array.length; i++) {
                // cada mútiplo de 3 que encuentro, lo meto en el array pequeño e incremento el puntero
				if (array[i] % 3 == 0) {
					result[b] = array[i];
					b++;
				}
			}
			System.out.println("Array resultante");
            // imprimo el array resultante
			System.out.println(Arrays.toString(result));
		}
    }
}
