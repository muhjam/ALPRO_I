package BASIC;

import java.util.Scanner;

public class TukarBilangan3 {

	public static void main(String[] args) {
		int A, B;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("A : "); A=sc.nextInt();
		System.out.print("B : "); B=sc.nextInt();
		
		// Jika A=5 dan B=7
		A=A+B; //	A=12, B=7
		B=A-B; //	B=5, A=12
		A=A-B; //	A=7, B=5
		
		System.out.println("A= "+A);
		System.out.println("B= "+B);
		
	}

}
