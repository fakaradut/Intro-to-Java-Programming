package chapter05;

public class Exercise05_15 {
	public static void main(String[] args) {
		/*
		 * (ASCII karakter tablosunu g�sterme) ASCII karakter tablosunda ! �den ~ �ye
		 * kadar olan karakterleri g�steren bir program yaz�n�z. Her sat�rda on karakter
		 * g�steriniz. Ek B�de ASCII tablosu verilmi�tir. Karakterler aras�nda tam
		 * olarak bir bo�luk bulunmal�d�r.
		 */
		int counter = 1;
		for (int a = 33; a <= 126; a++, counter++) {
			System.out.print(" " + (char) a);

			if (counter % 11 == 0)
				System.out.println("\n");
		}
	}
}
