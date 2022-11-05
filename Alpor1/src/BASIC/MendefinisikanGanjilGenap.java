
package BASIC;

import java.util.Scanner;

public class MendefinisikanGanjilGenap {

	public static void main(String[] args) {

		float bill ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bilangan : ");bill=sc.nextInt();
		
		
		if (bill % 2 == 1) {
		System.out.println(bill+", adalah bilangan ganjil");
		
		}else {
			System.out.println(bill+", adalah bilangan genap");
		}
		
	}

}
