package ejercicios;

import java.util.Scanner;

/**
 * 8. Programa que calcula el volumen de una esfera.
 * V = 4/3 PI R^3
 * @author David
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cálculo del volumen de una esfera");
		System.out.println("introduce radio:");
		double radio = teclado.nextDouble();
		
		double volumen= 4.0/3*Math.PI*Math.pow(radio, 3);
		System.out.printf("El volumen de la esfera es %.2f",volumen);
		teclado.close();
	}

}
