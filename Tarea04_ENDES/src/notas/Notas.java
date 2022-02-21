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

		califica(nota);
		reader.close();
	}

	/**
	 * @param nota
	 * @deprecated Use {@link #califica(int)} instead
	 */
	private static void cali(int nota) {
		califica(nota);
	}

	/**
	 * @param num_nota
	 */
	public static void califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";

		System.out.println(calificacion);
	}
	
}