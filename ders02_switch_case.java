package alg22no;

import java.util.Scanner;

public class ders02_switch_case {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir se�im yap�n�z\n"+
		"Kalan bakiye i�in 1'e bas�n�z\n"+
		"Bor� bilgileri i�in 2'ye bas�n�z\n"+
		"Hesap bilgileri i�in 3'e bas�n�z\n"+
		"��k�� i�in 0'a bas�n�z"
				);
		int secim = scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("Kalan miktar 0 tl");
			break;
		case 2:
			System.out.println("Bor� miktar� 1000000 tl");
			break;
		case 3:
			System.out.println("Hesap a��l�� tarihi 02/03/2022");
			break;
		case 0:
			System.out.println("��k��");
			break;
		default:
			System.out.println("L�tfen ge�erli bir say� giriniz!");
			break;
		}
		
		
		
		
		
	}

}
