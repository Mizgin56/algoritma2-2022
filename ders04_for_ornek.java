package alg22no;

import java.util.Scanner;

public class ders04_for_ornek {

	public static void main(String[] args) {
		// kullan�c�dan ald���m�z say�ya kadar olan say�lar�n toplam�n� bulal�m
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir say� giriniz=");
		int sayi = scan.nextInt();
		
		int toplam = 0;
		
		for(int i=0;i<sayi;i++) {
			toplam += i;
		}
		
		System.out.println("0 dan "+sayi+"'e kadar "
				+ "olan say�lar�n toplam� =" + toplam);
		
	}

}
