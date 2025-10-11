package package3;

public class Exercice4 {
	public static void affichage(double[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				System.out.println(t[i][j] + "");
			}
			System.out.println();
		}
	}

	public static boolean regulier(double[][] t) {
		if (t.length == 0)
			return false;
		int taille = t[0].length;
		for (int i = 0; i < t.length; i++) {
			if (t[i].length != taille)
				return false;

		}

		return true;

	}

	public static double[] sommelignes(double[][] t) {
		double[] resultat = new double[t.length];
		for (int i = 0; i < t.length; i++) {
			double somme = 0;
			for (int j = 0; j < t[i].length; j++) {
				somme += t[i][j];
			}
			resultat[i] = somme;
		}
		return resultat;
	}

	public static double[][] somme(double[][] t1, double[][] t2) {

		if (!regulier(t1) || !regulier(t2))
			return null;
		if (t1.length != t2.length || t1[0].length != t2[0].length)
			return null;
		double[][] resultas = new double[t1.length][t1[0].length];
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1[i].length; j++) {
				resultas[i][j] = t1[i][j] + t2[i][j];
			}
		}
		return resultas;
	}

	public static void main(String[] args) {
		double[][] t1 = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };

		double[][] t2 = { { 10, 20, 30 }, { 40, 70, 60 } };
		System.out.println("affichage de tableau t1 : ");
		Exercice4.affichage(t1);
		System.out.println("affichage de tableau t2 : ");
		Exercice4.affichage(t2);
		System.out.println("la tavleau est rgulier : " + Exercice4.regulier(t1));
		System.out.println("la tavleau est rgulier : " + Exercice4.regulier(t2));
		System.out.println("\nSomme des lignes de t1 :");
		double[] s = Exercice4.sommelignes(t1);
		for (double v : s)
			System.out.println(v);
		System.out.println("Somme de t1 et t2 :");
		double[][] somme = Exercice4.somme(t1, t2);
		if (somme != null)
			Exercice4.affichage(somme);
		else
			System.out.println("Tableaux non compatibles !");

	}
}
