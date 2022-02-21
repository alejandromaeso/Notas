package notas;

import java.util.Scanner;

/*
 * @by: Aleajandro Maeso Castillo
 *
 *	¿Qué función realiza la clase Notas? 
 *
 *	Pide al usuario una nota por teclado para que al introducirla se le asigne 
 * una calificación
 *
 */

public class Notas {

/*
 * Método principal mediante el cual el programa pide al usuario que introduzca una nota por pantalla y al enviarla 
 * imprima por pantalla la calificación.
 * 
 * Mediante refactorizaciones se han renombrado las variables.
 */
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		Califica.califica(nota);
		reader.close();
	}

	/**
	 * Se reemplaza el código que se encarga de especificar la califiacón en función a la nota que se ha introducido por pantalla
	 * por un método al cual llamamos "cali"
	 * @param nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	private static void cali(int nota) {
		Califica.califica(nota);
	}

	/**
	 * Del mismo modo que hemos utilizado la refactorización en el método anterior, aquí cambiado el nombre de la cabecera mediante refactorización
	 * poniéndole el nombre de "califica"
	 * @param num_nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void califica(int num_nota) {
		Califica.califica(num_nota);
	}

}