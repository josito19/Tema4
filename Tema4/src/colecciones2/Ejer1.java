package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos el escáner y los strings para almacenar las frases
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String frase1 = "";
		// Solicitamos las frases y las asignamos
		System.out.println("Introduzca la primera frase:");
		frase = sc.nextLine();
		System.out.println("Introduzca la segunda frase:");
		frase1 = sc.nextLine();
		// Las comparamos y devolvemos la más corta
		if (frase.length() > frase1.length()) {
			System.out.println("La frase más corta es: " + frase1);
		} else {
			System.out.println("La frase más corta es: " + frase);
		}

		sc.close();
	}

}
