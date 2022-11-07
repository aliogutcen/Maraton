package com.ogutcenali;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dizi boyutunu giriniz= ");
		int[] dizi = new int[scanner.nextInt()];

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(i + 1 + ".sayıyı girebilirsiniz..");
			dizi[i] = scanner.nextInt();
		}

		Soru2.diziOrnegi(dizi);

	}

	public static void diziOrnegi(int[] dizi) {

		int sayac = 1; // sayac 1 den başlatıyoruz çünkü tekrar eden sayıyı da dahil edebilmek için.
		int tekrarEden = 0;
		int tekrarEdenSayi = 1;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[i] == dizi[j] && i != j) { // i indexteki sayıyı diğer indexteki sayılar ile kontrol etmesi
													// için
					sayac++;

					if (dizi[i] != 0) {
						tekrarEden = dizi[i]; // tekrar eden sayıyı bulmak için
					} else {
						tekrarEdenSayi = dizi[i];
					}

				}

			}
			if (tekrarEden != 0 || tekrarEdenSayi != 1) {
				break;

			}
		}

		if (sayac == 1) {
			System.out.println("Tekrar Eden Sayı Bulunamamıştır ");
		} else if (tekrarEdenSayi != 1) {
			System.out.println(tekrarEdenSayi + " sayısı " + sayac + " kez tekrar etmiştir.!");
		} else {
			System.out.println(tekrarEden + " sayısı " + sayac + " kez tekrar etmiştir!");
		}

	}

}
