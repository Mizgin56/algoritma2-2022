package alg22no;

public class ders01_if_else {

	public static void main(String[] args) {
		int a,b,c;
		a = 4;
		b = 5;
		c = 7;

		if (a>b) {
			System.out.println("A say�s� B say�s�ndan b�y�kt�r");
		}else if(b>a) {
			System.out.println("B say�s� A say�s�ndan b�y�kt�r");
		}else {
			System.out.println("�ki say� e�ittir");
		}

		//�� say�dan en b�y���n� bulal�m
		if(a>=b && a>=c) { 
			if(a==b) {
				System.out.println("A = B en b�y�k");
			} else if(a==c) {
				System.out.println("A = C en b�y�k");
			} else {
				System.out.println("A en b�y�k");}

		}else if(b>=a && b>=c) {
			if(a==b) {
				System.out.println("A = B en b�y�k");
			} else if(b==c) {
				System.out.println("B = C en b�y�k");
			} else {
				System.out.println("B en b�y�k");}

		} else {
			if(a==c) {
				System.out.println("A = C en b�y�k");
			} else if(b==c) {
				System.out.println("B = C en b�y�k");
			} else {
				System.out.println("C en b�y�k");}

		}


	}//main blo�unun sonu

}//class'�n sonu
