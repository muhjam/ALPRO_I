package BASIC;

import java.util.Scanner;

public class hellonama {
// string Nama
// input (Nama)
// output ("hello ", Mama)
	
	
	public static void main(String[] args) {
		String Nama;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Nama :"); Nama=sc.nextLine();
		System.out.println("Hello "+Nama);
	}

}
