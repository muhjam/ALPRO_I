

import java.util.Scanner;

public class segitigaBintangRepeat {

	
	public static void main(String[] args) {

		  int i, jumlah, N;
	        System.out.println("Masukan nilai N : ");
	        Scanner inputan = new Scanner(System.in);
	        N = inputan.nextInt();
	        i = 1;   
	         do {
	           jumlah=1; 
	             do {
	                  System.out.print("*");
	                  jumlah++;
	            } while ( jumlah<=i );
	            System.out.println();
	            i++;
	        } while ( i<=N);  


	}
}
