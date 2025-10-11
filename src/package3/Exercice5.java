package package3;

import java.util.Scanner;

public class Exercice5 {

	public static void rotate90ClockwiseInPlace(int[][] A) {
		int N = A.length;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][N - 1 - j];
				A[i][N - 1 - j] = temp;
			}
		}
	}

	public static void afficher(int[][] A) {
		for (int[] ligne : A) {
			for (int val : ligne)
				System.out.print(val + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N = ");
		int N = sc.nextInt();

		int[][] A = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		rotate90ClockwiseInPlace(A);

		System.out.println("\nMatrice après rotation 90° horaire :");
		afficher(A);
		sc.close();
	}

}
