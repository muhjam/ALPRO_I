package BASIC;

import java.util.Scanner;

public class UtsSistemKelulusanSertifikasi2 {
	
	public static void main(String[] args) {
		int ujian1, ujian2;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Ujian ke-1 : "); ujian1=sc.nextInt();
		System.out.print("Ujian ke-2 : "); ujian2=sc.nextInt();

		
		if(ujian1>=65 && ujian2>=65) {
			System.out.println("Selamat anda lulus sertifikasi ini ");
		}else {
				System.out.println("Maaf, anda harus mencoba lagi lain waktu ");
			}
		
	}


}
