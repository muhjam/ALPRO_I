package BASIC;

import java.util.Scanner;

public class quizLuasPersegiPanjang {
	
	public static void main(String[] args) {
		int l, p, t;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Panjang : "); p=sc.nextInt();
		System.out.print("Tinggi : "); t=sc.nextInt();
		
		l= p*t;

		System.out.println("Panjang : "+p);
		System.out.println("Tinggi : "+t);
		System.out.println("Luas : "+l);
		
	}


}
