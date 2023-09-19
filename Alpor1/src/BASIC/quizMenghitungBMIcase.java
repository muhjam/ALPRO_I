package BASIC;

import java.util.Scanner;

public class quizMenghitungBMIcase {
	
	public static void main(String[] args) {
		int bb, tc, tm, bmi = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Berat Badan : "); bb=sc.nextInt();
		System.out.print("Tinggi : "); tc=sc.nextInt();
		
		System.out.println("Berat Badan: "+bb);
		System.out.println("Tinggi Badan: "+tc);
		
//		tm=(tc/100)*(tc/100);
//		bmi=bb/tm;

//		System.out.println("Berat Badan : "+bb);
//		System.out.println("BMI : "+bmi);
		
//		if(bmi<=18.5) {
//			System.out.println("Keterangan : Berat Badan Kurang");
//		}
//		else if(bmi<=24.9) {
//				System.out.println("Keterangan : Berat Badan Normal");
//		}
//			 else if(bmi<=29.9) {
//					System.out.println("Keterangan : Berat Badan Berlebih");
//		}		  else {
//						System.out.println("Keterangan : Obesitas");
//		}
		
		int ibmi= (int) bmi;
		System.out.println("IBMI kamu: "+ibmi);
		
		switch(bmi) {
		case 1:
		
		tm = (tc/100)*(tc/100);
		bmi = bb/tm;
		System.out.println("BMI kamu: "+bmi);
		if(bmi<=18.5) {
			System.out.println("Keterangan : Berat Badan Kurang");
		}
		break;
		case 2:
			
			tm = (tc/100)*(tc/100);
			bmi = bb/tm;
			System.out.println("BMI kamu: "+bmi);
		
			
			if(ibmi<=24.9) {
				System.out.println("Keterangan : Berat Badan Normal");
			}
			break;
		case 3:
			
			System.out.println("BMI kamu: "+bmi);
			if(bmi<=29.9) {
				System.out.println("Keterangan : Obesitas");
			} 
		
			break;
			default:
				System.out.println("Coba lagi");
			
		
		}
		
	}


}
