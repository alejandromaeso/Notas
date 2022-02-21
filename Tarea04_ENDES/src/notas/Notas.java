package notas;

import java.util.Scanner;

/*
 * @by: Aleajandro Maeso Castillo
 *
 *	�Qu� funci�n realiza la clase Notas? 
 *
 *	Pide al usuario una nota por teclado para que al introducirla se le asigne 
 * una calificaci�n
 *
 */

public class Notas {

/*
 * M�todo principal mediante el cual el programa pide al usuario que introduzca una nota por pantalla y al enviarla 
 * imprima por pantalla la calificaci�n.
 * 
 * Mediante refactorizaciones se han renombrado las variables.
 */
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir n�meros por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		Califica.califica(nota);
		reader.close();
	}

	/**
	 * Se reemplaza el c�digo que se encarga de especificar la califiac�n en funci�n a la nota que se ha introducido por pantalla
	 * por un m�todo al cual llamamos "cali"
	 * @param nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	private static void cali(int nota) {
		Califica.califica(nota);
	}

	/**
	 * Del mismo modo que hemos utilizado la refactorizaci�n en el m�todo anterior, aqu� cambiado el nombre de la cabecera mediante refactorizaci�n
	 * poni�ndole el nombre de "califica"
	 * @param num_nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void califica(int num_nota) {
		Califica.califica(num_nota);
	}

}