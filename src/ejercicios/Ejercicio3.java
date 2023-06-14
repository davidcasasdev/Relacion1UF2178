package ejercicios;

import java.util.Scanner;

/**
 * 3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla 
el doble y el triple de ese número.
 * @author David
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = entrada.nextInt();
		
		
		System.out.printf("tu número es %d, el doble es %d"
				+ " y el el triple es %d",num,num*2,num*3);
	}
}
