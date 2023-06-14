package ejercicios;

import java.util.Scanner;

/**
 * 6. Programa que pase una velocidad en Km/h a m/s. 
 * La velocidad se lee por teclado.

 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Conversión de KM/h a M/sg.\nIntroduce km/h:");
		float kmH= entrada.nextFloat();
		
		float mSg=kmH*1000/3600;
		System.out.printf("%.2f Km/h son %.2f m/sg", kmH,mSg);
	}
}
