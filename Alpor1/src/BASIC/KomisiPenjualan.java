package BASIC;

import java.util.Scanner;

public class KomisiPenjualan {

	public static void main(String[] args) {
		String nama;
		float penjualan, komisi;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Nama : "); nama=sc.next();
		System.out.print("Penjualan : "); penjualan=sc.nextInt();
		komisi = (float) 0.05 * penjualan;
		

		System.out.println("Nama= "+nama);
		System.out.println("Komisi= "+komisi);
		
	}

}
