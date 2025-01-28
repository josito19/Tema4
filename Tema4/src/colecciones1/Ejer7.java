package colecciones1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos el TreeMap
		TreeMap<String, String> diccionario = new TreeMap<String, String>();
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int opcion = 3;

		// Mientras que el usuario no introduzca 0 no salimos del bucle
		while (opcion != 0) {

			// Si la opcion es 1, añadimos la palabra y su traduccion al mapa
			if (opcion == 1) {
				System.out.println("Inserte la palabra en español");
				String esp = sc.next();
				System.out.println("Ahora su traducción");
				String ing = sc.next();
				diccionario.put(esp, ing);
			}
			// Si la opcion es 2, solicitamos la palabra y mostramos su traduccion
			if (opcion == 2) {
				System.out.println("¿Que palabra quiere traducir?");
				String palabra = sc.next();
				if (diccionario.containsKey(palabra)) {
					System.out.println(palabra + " en inglés es " + diccionario.get(palabra));
				} else {
					System.out.println("No se encontró en el diccionario");
				}
			}
			// Mostamos las opciones al usuario
			System.out.println("1.Inserta palabra");
			System.out.println("2.Busca palabra");
			System.out.println("0.Salir");
			opcion = sc.nextInt();
		}

		sc.close();
	}

}
