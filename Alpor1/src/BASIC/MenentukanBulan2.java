package BASIC;

import java.util.Scanner;

public class MenentukanBulan2 {
	
	public static void main(String[] args) {
int bulan, hari, totalhari;

Scanner sc= new Scanner(System.in);
System.out.print("Bulan Ke : "); bulan=sc.nextInt();
System.out.print("Total Hari Dalam Setahun (365 / 366) : "); totalhari=sc.nextInt();
System.out.println("--------------------->");

	if(bulan<=12&&totalhari==365||totalhari==366) {
		
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
				if(totalhari==365) {
					System.out.println("Jumlah Hari: 28");
				}else {
					System.out.println("Jumlah Hari: 29");
				}
				break;		
		}

	}else if(bulan>12&&totalhari==365||totalhari==366){
			System.out.println("Mohon maaf,bulan hanya tersedia 1 - 12 Saja!");
		  }else if(bulan<=12&&totalhari!=365&&totalhari!=366){
			  		System.out.println("Mohon maaf,input total hari dalam setahun hanya ada 365 & 366 saja!");
		  		}else if (bulan>12&&totalhari!=365&&totalhari!=366){
		  				  System.out.println("Mohon maaf,bulan hanya tersedia 1 - 12 Saja!");
		  				  System.out.println("Dan input total hari dalam setahun hanya ada 365 & 366 saja!");
		  		}

		if(bulan<=12&&totalhari==365) {
			System.out.println("Tahun Basithah");
		}else if(bulan<=12&&totalhari==366) {
				System.out.println("Tahun Kabisat");
			  }else {
				  
			  }
		
		
	}
}



