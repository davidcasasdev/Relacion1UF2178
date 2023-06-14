package ejercicios;

import java.util.Scanner;

/**
 * 11. Programa que lee un número de 3 cifras y muestra sus 
 * cifras por separado.
 * 345 
 * 3
 * 4
 * 5 
 * @author David
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número de 3 CIFRAS");
		int num = teclado.nextInt();
		
		int cifra1, cifra2, cifra3;
		cifra1=num/100;
		cifra2=num%100/10;
		cifra3=num%100%10;
		System.out.println("Tu número es "+num);
		System.out.println(cifra1+"\n"+cifra2+"\n"+cifra3);
		teclado.close();
	}

}
