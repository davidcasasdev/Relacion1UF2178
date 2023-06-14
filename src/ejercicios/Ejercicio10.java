package ejercicios;

import java.util.Scanner;

/**
 * 10. Programa que calcule el cambio que se debe devolver al 
 * usuario. Se pedirán por teclado dos números, el precio del 
 * artículo y el importe introducido. Se devolverá el número 
 * de monedas a entregar óptimo suponiendo que tenemos 
 * disponibilidad de monedas infinita
 * @author David
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Precio del articulo");
		float precio = teclado.nextFloat();
		
		System.out.println("Importe introducido:");
		float total = teclado.nextFloat();
		
		float cambio = total-precio;
		int euros = (int) cambio;
		int centimos = Math.round((cambio-euros)*100);
		
		int m2,m1,c50,c20,c10,c5,c2,c1;
		
		m2= euros/2;
		m1=euros%2;
		
		c50 = centimos/50;
		centimos=centimos%50;
		c20 = centimos/20;
		centimos=centimos%20;
		c10 = centimos/10;
		centimos=centimos%10;
		c5 = centimos/5;
		centimos=centimos%5;
		c2 = centimos/2;
		c1=centimos%2;
		
		System.out.printf("Tu cambio es %.2f que son\n"
				+ "%d monedas de 2€\n"
				+ "%d monedas de 1 €\n%d monedas de 50c\n"
				+ "%d monedas de 20c\n%d monedas de 10c\n"
				+ "%d monedas de 5c\n%d monedas de 2c\n"
				+ "%d monedas de 1c\n",
				cambio,m2,m1,c50,c20,c10,c5,c2,c1);
		teclado.close();
	}

}
