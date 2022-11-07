package com.ogutcenali;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Soru4.menu();
	}

	public static void menu() {
		boolean check = true;
		while (check) {

			Scanner sc = new Scanner(System.in);
			System.out.println("**************************");
			System.out.println("*Geometrik Hesaplayıcı*");
			System.out.println("");
			System.out.println("**************************");
			System.out.println("1-Kare Alan Hesaplama");
			System.out.println("2-Kare Çevre Hesaplama");
			System.out.println("3-Dikdörtgen Alan Hesaplama");
			System.out.println("4-Dikdörtgen Çevre Hesaplama");
			System.out.println("5-Daire Alan Hesaplama");
			System.out.println("6-Daire Çevre");
			System.out.println("7-ÇIKIŞ");
			System.out.print("hangi işlemi yapmak istersiniz= ");
			int a = sc.nextInt();

			if (a > 6 && a <= 7) {
				System.out.println("Programdan çıktınız!");
				check = false;
			} else {

				switch (a) {
				case 1:
					Soru4.kareAlanHesapla();
					check = true;
					break;
				case 2:
					Soru4.kareCevreHesapla();
					check = true;
					break;
				case 3:
					Soru4.dikdortgenAlanHesapla();
					check = true;
					break;
				case 4:
					Soru4.dikdortgenCevreHesapla();
					check = true;
					break;
				case 5:
					Soru4.daireAlani();
					check = true;
					break;
				case 6:
					Soru4.daireCevre();
					check = true;
					break;

				}

			}
		}
	}

	public static void kareAlanHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Karenin kenar uzunluğu nedir= ");
		int kenar = scanner.nextInt();
		int alan = kenar * kenar;
		System.out.println(kenar + "uzunluğu olan karenin alanı= " + alan);
	}

	public static void kareCevreHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Karenin kenar uzunluğu nedir= ");
		int kenar = scanner.nextInt();
		int cevre = kenar * 4;
		System.out.println(kenar + "uzunluğu olan karenin çevresi= " + cevre);
	}

	public static void dikdortgenAlanHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dikdörtgenin Uzun kenar uzunluğu nedir= ");
		int kenar = scanner.nextInt();
		System.out.print("Dikdörtgenin Kısa kenar uzunluğu nedir=");
		int kenar2 = scanner.nextInt();
		int alan = kenar * kenar2;
		System.out.println(kenar + " ve " + kenar2 + " uzunluğu olan dikdörgenin alanı= " + alan);
	}

	public static void dikdortgenCevreHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dikdörtgenin Uzun kenar uzunluğu nedir= ");
		int kenar = scanner.nextInt();
		System.out.print("Dikdörtgenin Kısa kenar uzunluğu nedir= ");
		int kenar2 = scanner.nextInt();
		int cevre = (kenar + kenar2) * 2;
		System.out.println(kenar + " ve " + kenar2 + " uzunluğu olan dikdörgenin alanı= " + cevre);
	}

	public static void daireAlani() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dairenin çap uzunluğu nedir= ");
		double cap = scanner.nextInt();
		double alan = (double) (Math.PI * Math.pow(cap, 2));
		System.out.println(cap + " uzunluğu olan dairenin alanı= " + alan);
	}

	public static void daireCevre() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dairenin çap uzunluğu nedir= ");
		double cap = scanner.nextInt();
		double cevre = (double) (Math.PI * cap * 2);
		System.out.println(cap + " uzunluğu olan dairenin çevresi= " + cevre);
	}
}
