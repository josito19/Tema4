package colecciones1;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos el randomizador
		Random rand = new Random();
		// Creamos el conjunto donde guardaremos lo numeros
		LinkedHashSet<Integer> conjuntoNum = new LinkedHashSet<Integer>();
		while (conjuntoNum.size() != 20) {
			conjuntoNum.add(rand.nextInt(1, 100));
		}

		System.out.println(conjuntoNum);
	}

}
