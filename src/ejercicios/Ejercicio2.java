package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Lee un nombre y muetralo con el texto Buenos días, texto introducido
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.printf("Buenos días, %s\n",nombre);
		teclado.close();
	}

}
