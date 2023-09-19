package BASIC;

import java.util.Scanner;

public class UtsMenghitungNAdanMenentukanIndex {
	
	public static void main(String[] args) {
	double uts, uas, tugas, hdr, na;
	String idx;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("UTS : "); uts=sc.nextDouble();
		System.out.print("UAS : "); uas=sc.nextDouble();
		System.out.print("Tugas : "); tugas=sc.nextDouble();
		System.out.print("kehadiran : "); hdr=sc.nextDouble();
		
		na= 0.35*uts+0.40*uas+0.25*tugas;
		
		if(hdr>=60) {
			if(na>=85) {
				idx="A";
			}else if(na>=70) {
				idx="B";
				}else if(na>=55) {
				idx="C";
					}else if(na>=30) {
				idx="D";
					}else {
						idx="E";
					}
		}else {
			idx="E";
		}
		
		System.out.println("NA : "+na);
		System.out.println("Index : "+idx);
	}


}
