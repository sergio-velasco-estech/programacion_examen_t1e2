import java.util.Random;
import java.util.Scanner;

public class ConcatenaArrays {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

        // se piden los dos tamaños
		System.out.println("Introduce el tama�o del primer array");
		int tam1 = sc.nextInt();
		System.out.println("Introduce el tama�o del primer array");
		int tam2 = sc.nextInt();

        // se inicializan los dos arrays
		int[] array1 = new int[tam1];
		int[] array2 = new int[tam2];

        // se rellena e imprime el primer array
		System.out.println("Array 1");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rnd.nextInt(100);
			System.out.print(array1[i] + ",");
		}
        // se rellena e imprime el segundo array
		System.out.println("\nArray 2");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = rnd.nextInt(100);
			System.out.print(array2[i] + ",");
		}
        // el tercer array tendrá el tamaño de los dos primeros arrays
		int[] array3 = new int[tam1 + tam2];

        // tengo que rellenar el array3 con los dos primeros arrays consecutivos
        // una solución es recorrer el array3, que es más grande, y mientras que la
        // i del for sea menor que el tamaño 1, pongo el valor de array1 en array3
        // el array2 irá después del array1, por tanto, irá en el índice+tam1 del array3
		for (int i = 0; i < array3.length; i++) {
			if (i < tam1)
				array3[i] = array1[i];
			if (i < tam2)
				array3[i + tam1] = array2[i];
		}
        //imprimo el array resultante
		System.out.println("\nArray resultado");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ",");
		}

		sc.close();


        /*********************VARIANTE  ******************************/
        /*
         * para rellenar el array3, el array1 irá desde el índice 0 hasta su tamaño -1
         * y el array2 irá desde el índice tam1 hasta el fina
         * puedo usar una variable auxiliar como contador para el array2
         */
        /* 
        int contador = tam1;
        // bucle que da tantas vueltas como el tamaño del array1
        for (int i = 0; i < array1.length; i++) {
				array3[i] = array1[i];
			if (i < tam2)
				array3[i + tam1] = array2[i];
		}
        // bucle que da tantas vueltas como el tamaño del array2
        for (int i = 0; i < array2.length; i++) {
            array3[contador] = array2[i];
            contador++;
        }
        */

	}
}