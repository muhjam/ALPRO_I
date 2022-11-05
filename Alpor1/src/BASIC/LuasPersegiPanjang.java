package BASIC;

import java.util.Scanner;

public class LuasPersegiPanjang {
	
	public static void main(String[] args) {
		float panjang, lebar, luas;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Panjang : "); panjang=sc.nextFloat();
		System.out.print("Lebar : "); lebar=sc.nextFloat();
		luas= panjang * lebar;
		System.out.println("Luas : "+luas+"cm");
		
	}


}
