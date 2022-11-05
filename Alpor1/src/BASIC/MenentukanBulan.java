package BASIC;

import java.util.Scanner;

public class MenentukanBulan {
	
	public static void main(String[] args) {
int bulan, hari;

Scanner sc= new Scanner(System.in);
System.out.print("Bulan Ke : "); bulan=sc.nextInt();
System.out.println("--------------------->");

if(bulan<=12) {
	

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
				System.out.print("Jumlah Hari 28 / 29 : "); hari=sc.nextInt();
				System.out.println("--------------------->");
				System.out.println("Nama Bulan: Febuari");
				if(hari==28||hari==29) {

				switch(hari) {
				case 28:
					System.out.println("Jumlah Hari: 28");
					System.out.println("Disebut Dengan Bulan Basithah");
					break;
				case 29:
					System.out.println("Jumlah Hari: 29");
					System.out.println("Disebut Dengan Bulan Kabisat");
					break;
						}
	
					}else {
						System.out.println("Mohon maaf, hanya ada 28 & 29!");
					}
				break;
	}

}else{
System.out.println("Mohon maaf,bulan hanya tersedia 1 - 12 Saja!");
}
		
	}


}



