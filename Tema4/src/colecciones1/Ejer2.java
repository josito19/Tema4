package colecciones1;

import java.util.ArrayList;
import java.util.Random;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos el random y la arraylist para almacenar los números
		Random rand = new Random();
		// Creamos la variable tamaño para el arraylist
		int tamaño = rand.nextInt(5, 11);
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(tamaño);
		// Creamos las variables que almacenarán la suma, media, máximo y mínimo
		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 100;
		// Inicializamos el arraylist con los números aleatorios
		for (int i = 0; i < tamaño; i++) {
			numerosAleatorios.add(i, rand.nextInt(0, 101));

		}
		// Creamos un bucle for para recorrer el arraylist
		for (int i = 0; i < numerosAleatorios.size(); i++) {
			// iremos sumando cada numero del arraylist y almacenandolo en suma
			suma += numerosAleatorios.get(i);
			// dividimos la suma entre el numero total, para encontrar la media
			media = suma / numerosAleatorios.size();
			// Si el anterior numero es mayor, lo almacenamos en maximo
			if (numerosAleatorios.get(i) >= maximo) {
				maximo = numerosAleatorios.get(i);
			}
			// Si el anterior numeor es menor, lo almacenamos en minimo
			if (numerosAleatorios.get(i) <= minimo) {
				minimo = numerosAleatorios.get(i);
			}
		}
		System.out.println(suma + "\t" + media + "\t" + minimo + "\t" + maximo);
	}

}
