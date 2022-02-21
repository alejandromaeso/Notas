package notas;

import java.util.Scanner;

/*
 * @by: Aleajandro Maeso Castillo
 */

public class Notas {

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
	 * @param nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	private static void cali(int nota) {
		Califica.califica(nota);
	}

	/**
	 * @param num_nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void califica(int num_nota) {
		Califica.califica(num_nota);
	}
	
}