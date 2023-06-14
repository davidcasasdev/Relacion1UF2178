package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número de 5 CIFRAS");
		int num = teclado.nextInt();
		
		System.out.println("Tú número es "+num);
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num);
		
		teclado.close();

	}

}
