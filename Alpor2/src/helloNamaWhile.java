

import java.util.Scanner;

public class helloNamaWhile {
	
	public static void main(String[] args) {

		
String Nama;
		
		Scanner sc= new Scanner(System.in);
		
		int i=1;
		
		while(i<=3) {
			System.out.print("Nama : ");Nama=sc.nextLine();
			System.out.println("Hello "+Nama);
			i++;
		}
		
		
		
	}


}
