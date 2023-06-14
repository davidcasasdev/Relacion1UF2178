package ejercicios;

import java.util.Scanner;

/**
 * 5. Programa que lee por teclado el valor del radio de una 
 * circunferencia y calcula y muestra por pantalla la longitud y el área
 *  de la circunferencia. 
 *  Longitud de la circunferencia = 2*PI*Radio, 
 *  Area de la circunferencia = PI*Radio^2 
 * @author David
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//final float PI = 3.14159f;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa que calcula el área y el "
				+ "perímetro de un círculo dado su radio");
		System.out.println("Radio:");
		double radio = teclado.nextFloat();
		
		double area = Math.PI * Math.pow(radio, 2);
		double longitud= 2* Math.PI * radio;
		
		System.out.printf("El área es %.2f y el perímetro"
				+ " es %.2f", area, longitud);
		teclado.close();

	}

}
