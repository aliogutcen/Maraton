package com.ogutcenali;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		System.out.println(Soru3.karakterSayici("Bugün güzel bir gün", 'g'));
		System.out.println(Soru3.karakterSayici("Bugün güzel bir gün", 'w'));
		System.out.println(Soru3.karakterSayici("Başka örnekler için ", 'b')); // başka örnekler için
	}

	public static int karakterSayici(String kelimeCumle, char harf) {

		int sayac = 0;
		for (int i = 0; i < kelimeCumle.length(); i++) {
			if (kelimeCumle.charAt(i) == harf) {
				sayac++;
			}
		}
		return sayac;
	}

}
