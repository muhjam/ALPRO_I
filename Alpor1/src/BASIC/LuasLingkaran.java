package BASIC;

import java.util.Scanner;

public class LuasLingkaran {
	
	public static void main(String[] args) {
		float phi=22/7, r, luas;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("r : "); r=sc.nextFloat();
		luas= phi * r * r;
		System.out.println("Luas : "+luas);
		
	}


}
