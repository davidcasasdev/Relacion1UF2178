package ejercicios;

import java.util.Scanner;

/**
 * 14. Programa que calcula el número de la suerte de una 
 * persona partir de su fecha de nacimiento.
 * El número de la suerte se calcula sumando el día, mes y año 
 * de la fecha de nacimiento y a continuación sumando las cifras
 * obtenidas en la suma.
 * Por ejemplo:
 * Si la fecha de nacimiento es 12/07/1980
 * Calculamos el número de la suerte así: 
 * 12+7+1980 = 1999 1+9+9+9 = 28
 * Número de la suerte: 28
 * @author David
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cálculo del número de la suerte");
		System.out.println("Introduce tu fecha de nacimiento");
		System.out.println("Día:");
		int dia = teclado.nextInt();
		System.out.println("Mes:");
		int mes = teclado.nextInt();
		System.out.println("Año:");
		int anio = teclado.nextInt();
		
		int nSuerte = dia+mes+anio;
		
		int cifra1, cifra2, cifra3, cifra4;
		cifra1=nSuerte/1000;
		cifra2=nSuerte%1000/100;
		cifra3=nSuerte%1000%100/10;
		cifra4=nSuerte%1000%100%10;
		nSuerte = cifra1+cifra2+cifra3+cifra4;
		
		System.out.println("Tú número de la suerte es "+nSuerte);
		teclado.close();
	}

}
