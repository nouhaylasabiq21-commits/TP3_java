package package3;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez vous La hauteur du triangle :  ");
		int h = sc.nextInt();
		for (int i = 1; i <= h; i++) {
			for (int j = i; j < h; j++) {

				System.out.println("");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
