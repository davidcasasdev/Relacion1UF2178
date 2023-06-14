package ejercicios;

import java.util.Scanner;

/**
 * 15. Programa para pasar de grados centígrados a grados Kelvin.
 * @author David
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa de convesion de grados "
				+ "centigrados a Kelvin");
		float centigrados = teclado.nextFloat();
		System.out.println("Son "+(centigrados+273)+" grados kelvin");

	}

}
