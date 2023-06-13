package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pide 2 numeros por teclado y los muestra en pantalla
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		double num1 = teclado.nextDouble();
		
		System.out.println("Introduce otro número:");
		double num2 = teclado.nextDouble();
		
		System.out.println("El numero 1 es "+num1
				+ " y el número 2 es "+ num2);

	}

}
