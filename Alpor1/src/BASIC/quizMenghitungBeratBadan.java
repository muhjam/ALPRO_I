package BASIC;

import java.util.Scanner;

public class quizMenghitungBeratBadan {
	
	public static void main(String[] args) {
		float bb, tc, tm, bmi;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Berat Badan : "); bb=sc.nextInt();
		System.out.print("Tinggi : "); tc=sc.nextInt();
		
		tm=(tc/100)*(tc/100);
		bmi=bb/tm;

		System.out.println("Berat Badan : "+bb);
		System.out.println("BMI : "+bmi);
		
		if(bmi<=18.5) {
			System.out.println("Keterangan : Berat Badan Kurang");
		}
		else if(bmi<=24.9) {
				System.out.println("Keterangan : Berat Badan Normal");
		}
			 else if(bmi<=29.9) {
					System.out.println("Keterangan : Berat Badan Berlebih");
		}		  else {
						System.out.println("Keterangan : Obesitas");
		}
		
		
	}


}
