package ejercicios;

import java.util.Scanner;

/**
 * 7. Programa lea la longitud de los catetos de un triángulo
 *  rectángulo y calcule la longitud de la hipotenusa según 
 *  el teorema de Pitágoras.
 * @author David
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cálculo de la hipotenusa mediante Pitagoras");
		System.out.println("Cateto1: ");
		float cat1 = teclado.nextFloat();
		System.out.println("Cateto2: ");
		float cat2 = teclado.nextFloat();
		
		double hip = Math.sqrt(
				Math.pow(cat1, 2)+Math.pow(cat2, 2)
				);
		System.out.printf("La hipotenusa de un triángulo de catetos "
				+ "%.2f y %.2f es %.2f", cat1, cat2, hip);
	}

}
