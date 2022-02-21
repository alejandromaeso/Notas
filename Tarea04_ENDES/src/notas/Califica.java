/**
 * 
 */
package notas;

/**
 * @author Alejandrico
 *
 */
public class Califica {

	/**
	 * Se ha creado esta nueva clase en la que se ha movido el método "califica" 
	 * mediante la funcionalidad "mover" de la refactorización
	 * @param num_nota: este es el parámetro que va a introducir el usuario por teclado.
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
