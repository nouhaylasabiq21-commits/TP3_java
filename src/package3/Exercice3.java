package package3;

import java.util.Scanner;

public class Exercice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez vous combien de valeurs doivent être affichées ");
		int n = sc.nextInt();
		int[] carres = new int[n];
		int nombreimpair = 1;
		for (int i = 0; i < n; i++) {
			carres[i] = nombreimpair * nombreimpair;
			System.out.println(nombreimpair + " a pour carre " + carres[i]);
			nombreimpair += 2;
		}
		sc.close();
	}

}
