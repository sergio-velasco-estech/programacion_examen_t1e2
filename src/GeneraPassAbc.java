import java.util.Random;
import java.util.Scanner;

public class GeneraPassAbc {
    public static void main(String[] args) {
        // array con las letras A B y C
		char[] letras = {'A', 'B', 'C'};

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int tam = 0;
        // pido un tamaño hasta que sea 6 o mayor;
		do {
			System.out.println("Introduce un tama�o para la contrase�a no inferior a 6.");
			tam = sc.nextInt();
		} while (tam < 6);

		String pass = ""; // variable para guardar el pass final
		
        /**
         * La idea es sacar un número random entre 0 y 9.
         * Ese número se concatena en la variable pass
         * Vamos a repetir este paso tantas veces como el tamaño vaya a tener la contraseña -1
         * es tamaño -1 porque el ultimo caracter será para A, B o C
         * por tanto, el for va desde 0 hasta el tamaño de la contraseña - 1
         */

		for (int i = 0; i < tam - 1; i++) {
			int num = rnd.nextInt(10); // saco numero random
			pass += num; // lo concateno a pass
		}
        // llegado aquí, tendré una contraseña con número aleatorios, falta la letra
		// saco un número aleatorio entre 0 y 2, y con ese número saco una letra del array de ABC
		int rLetra = rnd.nextInt(3);
		pass += letras[rLetra]; // la letra se concatena a pass

		System.out.println("Contrase�a autogenerada:\n" + pass); // se imprime el pass

		sc.close();

	}
}
