package edu.prog;

import java.util.Scanner;

public class TeoremaPitagoras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double cateto1, cateto2, hipotenusa;

		System.out.println("Determine la longitud de los catetos: ");
		cateto1 = sc.nextInt();
		cateto2 = sc.nextInt();

		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.println(hipotenusa);
	}

}
