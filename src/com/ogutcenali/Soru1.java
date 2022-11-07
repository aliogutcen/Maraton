package com.ogutcenali;

public class Soru1 {

	public static void main(String[] args) {
		Soru1.cizimYildiz(7); // ilk satırda kaç yıldız olmasını istiyorsak parantez içine o sayıyı yazıyoruz.
	}

	public static void cizimYildiz(int yildiz) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < yildiz; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(); // yıldızlar basıldıktan sonra alt satıra geçmek için

		}
		int yildiz1 = 6;
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j < yildiz1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			yildiz1--; // yıldız sayımızı bir bir azaltıyoruz

		}

	}

}
