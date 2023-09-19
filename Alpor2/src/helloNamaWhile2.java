

import java.util.Scanner;

public class helloNamaWhile2 {
	
//	Pengulangan Kondisional
	
	public static void main(String[] args) {

		
String Nama;
		
		Scanner sc= new Scanner(System.in);
		
		int i=1;
	
		System.out.print("Nama : ");Nama=sc.nextLine();
		
		while(!Nama.equals("999")) {
				System.out.println("Hello "+Nama);
				i++;
				System.out.print("Nama : ");Nama=sc.nextLine();

		}
		
		
		
	}


}
