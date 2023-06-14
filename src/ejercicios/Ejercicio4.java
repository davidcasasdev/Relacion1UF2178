package ejercicios;

import java.util.Scanner;

/**
 * 4. Programa que lea una cantidad de grados centígrados y la pase a
 *  grados Fahrenheit. La fórmula correspondiente es: 
 *  F = 32 + ( 9 * C / 5)
 * @author David
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Grados centigrados: ");
		double centigrados = teclado.nextDouble();
		
		double farenheit = 32 +(9/5.0*centigrados);
		System.out.printf("%.2f grados centgrados son %.2f grados farenheit",
				centigrados,farenheit);
		teclado.close();

	}

}
