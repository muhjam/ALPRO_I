package BASIC;

import java.util.Scanner;

public class UtsNo4 {
	
	public static void main(String[] args) {
		int a=10, b=8, c=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println(a+", "+b+", "+c); 		
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a+", "+b+", "+c);
		
		c=a+1*b-1;
		System.out.println(a+", "+b+", "+c);
		
	}


}
