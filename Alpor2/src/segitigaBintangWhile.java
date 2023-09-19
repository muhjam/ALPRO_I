

import java.util.Scanner;

public class segitigaBintangWhile {

	
	public static void main(String[] args) {

		 int i, jumlah, N;
	        System.out.println("Masukan nilai N : ");
	        Scanner inputan = new Scanner(System.in);
	        N = inputan.nextInt();
	        i = 1;   
	        while ( i<=N) {
	           jumlah=1; 
	            while ( jumlah<=i ){
	                  System.out.print("*");
	                  jumlah++;
	            }
	            System.out.println();
	            i++;
	        }   

	}
}
