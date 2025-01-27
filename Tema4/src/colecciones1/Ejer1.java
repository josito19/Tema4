package colecciones1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		// num guardará el valor recibido por escáner
		int num = 1;
		// Creamos el arraylist de numeros enteros
		ArrayList<Integer> numerosEnteros = new ArrayList<>();
		// Mientras que el numero introducido no sea negativo:
		while (num >= 0) {
			// Se agrega el número al conjunto
			numerosEnteros.add(num);
			// Se solicita el siguiente
			num = sc.nextInt();
		}
		// Recorremos el conjunto con un for
		for (int i = 0; i < numerosEnteros.size(); i++) {
			// Si hay algún número par lo mostramos en pantalla
			if (numerosEnteros.get(i) % 2 == 0) {
				System.out.println(numerosEnteros.get(i));

			}
		}
		sc.close();
	}

}
