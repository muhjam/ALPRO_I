package ManajemenPenerbangan;

import java.util.Scanner;

public class Penerbangan { 
	
String nop, asal,tujuan; Date tglB, tglArr;
Time jamB,jamArr;

	public static void main(String[] args) { Penerbangan C=new Penerbangan();
	Scanner sc= new Scanner(System.in);
	System.out.print("no Penerbangan : ");C.nop=sc.next(); 
	System.out.print("Bandara Asal : ");C.asal=sc.next(); 
	System.out.print("Bandara Tujuan : ");C.tujuan=sc.next(); 
	System.out.print("Tanggal berangkat : ");C.tglB.inputtanggal(); 
	System.out.print("Jam berangkat : ");C.jamB.inputjam(); 
	System.out.print("Tanggal Kedatangan : ");C.tglArr.inputtanggal(); 
	System.out.print("Jam Kedatangan : ");C.jamArr.inputjam();
	System.out.println("Data Penerbangan "+ C.nop+"\n"); 
	System.out.println(C.asal+"\n"); System.out.println(C.tujuan+"\n"); 
	System.out.println("Berangkat: "); C.tglB.outputtanggal();C.jamB.outputjam(); 							System.out.println("Kedatangan: "); C.tglArr.outputtanggal(); C.jamArr.outputjam();
	} 
}