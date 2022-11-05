
package BASIC;

import java.util.Scanner;

public class KonversiJam {

	public static void main(String[] args) {
        int jam, menit, detik, konversi;
		

	        Scanner input = new Scanner(System.in);



	        System.out.print("Berapa detik yang ingin anda konversikan : ");
	        konversi = input.nextInt();

	        jam     = konversi/3600;
	        menit   = (konversi%3600)/60;
	        detik   = (konversi%3600)%60;

	        System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
	        System.out.println(jam+" jam, "+menit+" menit, "+detik+" detik");
		
	}

}
