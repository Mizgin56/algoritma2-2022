package alg22no;

import java.util.Scanner;

public class ders05_for_ornek {

	public static void main(String[] args) {
		// iki say� aral���nda bulunan say�lardan
		// 3'e tam b�l�nenlerin adedi, toplam�, ortalamas�
		int a,b,kucuk,buyuk,bolunen;
		int adet,toplam;
		float ort;
		adet = 0;
		toplam = 0;
		kucuk = 0;
		buyuk = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir say� giriniz:");
		a = scan.nextInt();
		System.out.print("Bir say� daha giriniz:");
		b = scan.nextInt();
		System.out.print("Hangi say�ya b�l�ns�n:");
		bolunen = scan.nextInt();
		
		
		if(a==b) {
			System.out.println("L�tfen farkl� say�lar giriniz!");
		}else if(a>b) {
			buyuk = a;
			kucuk = b;
		}else {
			buyuk = b;
			kucuk = a;
		}
		
		for(int i=kucuk;i<buyuk;i++) {
			if(i%bolunen==0) {
				adet++;
				toplam +=i;
			}
		}
		
		ort = (float)toplam/adet;
		
		System.out.println(kucuk+"'den "+ buyuk + " e kadar "+
		+bolunen +"'e tam b�l�nen");
		System.out.println("Adeti = "+ adet);
		System.out.println("Toplam = "+ toplam);
		System.out.println("Ortalamas� = "+ ort);

	}

}
