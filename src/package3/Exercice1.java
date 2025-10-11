package package3;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez vous la valeur de n : ");
		int n = sc.nextInt();
		double somme = 0;
		for (int i = 1; i <= n; i++) {
			somme += 1 / i;

		}
		System.out.println("la valeur du somme harmonique lorsque n = " + n + "  est  = " + somme);
		sc.close();
	}

}
