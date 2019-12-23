package application;

import java.util.Scanner;

public class Program {

	//Programa para ler um vetor de 20 números inteiros e apresentar três vetores distintos (Vetor original, Vetor Par e Vetor ímpar)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int par = 0;
		int imp = 0;
		int p = 0;
		int im = 0;

		int vect[] = new int[4];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				par += 1;
			} else
				imp += 1;
		}

		int vectpar[] = new int[par];
		int vectimp[] = new int[imp];

		System.out.println("---------------");
		System.out.println("The numbers of the Main Vector is;");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("The numbers of the Pair Vector is;");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				vectpar[p] = vect[i];
				System.out.println(vectpar[p]);
				p += 1;
			}
		}

		System.out.println("The numbers of the Odd Vector is;");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 != 0) {
				vectimp[im] = vect[i];
				System.out.println(vectimp[im]);
				im += 1;
			}
		}

		sc.close();

	}
}