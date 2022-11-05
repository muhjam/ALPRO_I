

import java.util.Scanner;

public class helloNamaRepeat {
	
	public static void main(String[] args) {

		
String Nama;
		
		Scanner sc= new Scanner(System.in);
		
		int i=1;
		
		do{
			System.out.print("Nama : ");Nama=sc.nextLine();
			System.out.println("Hello "+Nama);
			i++;
		}while(i<=3);
		
		
		
	}


}
