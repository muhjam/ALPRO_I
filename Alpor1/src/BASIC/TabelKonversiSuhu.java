package BASIC;

import java.util.Scanner;

public class TabelKonversiSuhu {
	
	public static void main(String[] args) {
//		F, C : real
//		x, y, step : integer
//		read[x, y, step]
//		F = x
		
//		while f <= y do
//		C = 5/9 * (F, C)
//		F= F + step
//		endwhile
		
		// membuat keterangan
		
		float C, F;
		int x, y, step;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Nilai x : ");x=sc.nextInt();
		System.out.print("Nilai y : ");y=sc.nextInt();
		System.out.print("Nilai step : ");step=sc.nextInt();
		F	=	x;
		
		//	Nama Kolom
		System.out.println(" F			C");
		
		
		// Mendeklarasikan
		while(F	<=	y) {
			C=(float)5/9*(F-32);
			System.out.println(F+"		"+C);
			F = F + step;
		}

	}


}
