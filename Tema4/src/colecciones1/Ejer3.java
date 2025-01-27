package colecciones1;

import java.util.ArrayList;
import java.util.Random;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos rand para randomizar los numeros
		Random rand = new Random();
		// Creamos la lista para almacenar los numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Recorremos la lista añadiendo cada vez los numeros aleatorios
		for (int i = 0; i < 30; i++) {
			numeros.add(rand.nextInt(1, 11));
		}
		// Ordenamos la lista
		numeros.sort(null);

		// Mostramos en pantalla el conjunto
		System.out.println(numeros);

	}

}
