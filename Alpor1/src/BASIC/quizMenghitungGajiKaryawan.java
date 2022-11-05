package BASIC;

import java.util.Scanner;

public class quizMenghitungGajiKaryawan {
	
	public static void main(String[] args) {
		
	float gapok, tunjangan, bonus, gol, gajik;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Golongan : "); gol=sc.nextFloat();
		
		if(gol==1) {
			bonus=0;
			gapok=2000000;
		}else if(gol==2) {
			bonus=100000;
			gapok=2500000;
		}else if(gol==3) {
			bonus=200000;
			gapok=3000000;
		}else if(gol==4) {
			bonus=300000;
			gapok=4000000;
		}else {
			bonus=0;
			gapok=0;
		}
		
		tunjangan= (float)2/100*gapok;		
		gajik= gapok+tunjangan+bonus;
	
		System.out.println("Gaji Karyawan : "+gajik);
		
		
		
	}


}
