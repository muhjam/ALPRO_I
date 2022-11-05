package BASIC;

import java.util.Scanner;

public class KonversiSuhu {
	
	public static void main(String[] args) {
		Float c, f;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Hasil 5/9= "+ (float) 5/9);
		System.out.print("f :"); f=sc.nextFloat();
		c=(float)5/9*(f-32); // Cascading hasil pembagian ke float
		System.out.println("C "+c);
		
	}


}
