package espm_algoritmos.lista_exerc2;

public class Exerc02_c {
	public static void main(String[] args) {

		int a = 2, b = 7;
		double c = 3.5;
		boolean d = false;

		boolean letra_c;

		letra_c = d && b / a >= c || !(a <= c);

		if (letra_c) {
			System.out.println("A expressão é verdadeira!");
		} else {
			System.out.println("A expressão é falsa!");
		}

	}

}
