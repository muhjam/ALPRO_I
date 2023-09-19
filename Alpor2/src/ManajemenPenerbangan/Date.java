package ManajemenPenerbangan;

import java.util.Scanner;

public class Date {

	int dd;
	int mm;
	int ccyy;
	
	Date(){
		
	}
	
	
	Date(int d, int m, int t){
		 dd=d;m=mm;ccyy=t;
		 }
	
	void inputtanggal() {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("tanggal : ");dd=sc.nextInt();
		 System.out.print("bulan : ");mm=sc.nextInt();
		 System.out.print("tahun : ");ccyy=sc.nextInt();
		 }
	
	
	void outputtanggal() {
		System.out.print(""+dd);System.out.print("-"+mm);System.out.println("-"+ccyy);
		 }
	
	public static void main(String[] args) {
		 Date J=new Date();
		 Scanner sc= new Scanner(System.in);
		 J.inputtanggal();
		 J.outputtanggal();
//		 System.out.print("tanggal : ");J.dd=sc.nextInt();
//		 System.out.print("bulan : ");J.mm=sc.nextInt();
//		 System.out.print("tahun : ");J.ccyy=sc.nextInt();
//		 System.out.print(""+J.dd);System.out.print("-"+J.mm);System.out.println("-"+J.ccyy);
		 }
		
	
}



