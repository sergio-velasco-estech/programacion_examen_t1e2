import java.util.Random;
import java.util.Scanner;

public class GeneraPass {
    public static void main(String[] args) {

        // este String será transformado a un array de char para poder acceder a cada letra
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxy!@#%&/()=?��-_";

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int tam = 0;
        // pide un tamaño de contraseña hasta que sea 8 o mayor
		do {
			System.out.println("Introduce un tama�o para la contrase�a no inferior a 8.");
			tam = sc.nextInt();
		} while (tam < 8);

        /*
         * la idea es coger un número random desde 0 hasta el tamaño del array de letras
         * ese número random se usará como índice para sacar una letra del array de letras
         * después esa letra se concatena en el String pass
         * tendré que repetir tantas veces como el tamaño de la contraseña
         */

		String pass = "";  // variable pass de tipo String para guardar la contraseña resultado
		char[] array = letras.toCharArray(); //transformo el String letras en array de caracteres
		for (int i = 0; i < tam; i++) {
			int num = rnd.nextInt(array.length); // imagina que sale el número 5
			pass += array[num]; // en el array, el índice 5 es la F, pues la F será un caracter del pass
		}

        // imprime la contraseña
		System.out.println("Contrase�a autogenerada:\n" + pass);

		sc.close();

	}
}
