package BASIC;

import java.util.Scanner;

public class MenentukanBulan3 {
	
	public static void main(String[] args) {

	int tahun, bulan, hari;


Scanner sc= new Scanner(System.in);
System.out.print("Bulan Ke : "); bulan=sc.nextInt();
System.out.print("Basithah / Kabisat (ketik 1 / 2) : "); tahun=sc.nextInt();
System.out.println("--------------------->");

	if(bulan<=12&&bulan>0&&tahun==1||bulan<=12&&bulan>0&&tahun==2) {
		
		switch(bulan) {
		case 1:
			System.out.println("Nama Bulan: Januari");
			System.out.println("Jumlah Hari: 31");
			break;
		case 3:
			System.out.println("Nama Bulan: Maret");
			System.out.println("Jumlah Hari: 31");
			break;
		case 5:
			System.out.println("Nama Bulan: Mei");
			System.out.println("Jumlah Hari: 31");
			break;
		case 7:
			System.out.println("Nama Bulan: Juli");
			System.out.println("Jumlah Hari: 31");
			break;
		case 8:
			System.out.println("Nama Bulan: Agustus");
			System.out.println("Jumlah Hari: 31");
			break;
		case 10:
			System.out.println("Nama Bulan: Oktober");
			System.out.println("Jumlah Hari: 31");
			break;
		case 12:
			System.out.println("Nama Bulan: Desember");
			System.out.println("Jumlah Hari: 31");
			break;
		case 4:
			System.out.println("Nama Bulan: April");
			System.out.println("Jumlah Hari: 30");
			break;
		case 6:
			System.out.println("Nama Bulan: Juni");
			System.out.println("Jumlah Hari: 30");
			break;
		case 9:
			System.out.println("Nama Bulan: September");
			System.out.println("Jumlah Hari: 30");
			break;
		case 11:
			System.out.println("Nama Bulan: November");
			System.out.println("Jumlah Hari: 30");
			break;
			case 2:
				System.out.println("Nama Bulan: Febuari");
				if(tahun==1) {
					System.out.println("Jumlah Hari: 28");
				}else {
					System.out.println("Jumlah Hari: 29");
				}
				break;		
		}

	}else {
		System.out.println("Mohon maaf, inputan tidak sesuai. mohon isi bulan 1 - 12 ");
		System.out.println("dan untuk basithah / kabisat pilihannya hanya 1 & 2");
	}

		if(bulan<=12&&bulan>0&&tahun==1) {
			System.out.println("Dengan jumlah total hari dalam setahun 365 Hari");
			System.out.println("Disebut dengan Tahun Basithah");
		}else if(bulan<=12&&bulan>0&&tahun==2) {
				System.out.println("Dengan jumlah total hari dalam setahun 366 Hari");
				System.out.println("Disebut dengan Tahun Kabisat");
			  }else {
				  
			  }
		
		
	}
}



