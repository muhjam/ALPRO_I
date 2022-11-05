package BASIC;

import java.util.Scanner;

public class TukarBilangan2 {

	public static void main(String[] args) {
		int A, B, C;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("A : "); A=sc.nextInt();
		System.out.print("B : "); B=sc.nextInt();
		
		// Jika A=5 dan B=7
		C=A; //C=5, A=5 B=7
		B=C; //B=5, A=5 C=5
		A=B; //A=5, B=5 C=5
		
		System.out.println("A= "+A);
		System.out.println("B= "+B);
		
	}

}
