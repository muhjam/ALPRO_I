package record;
import java.util.Scanner;

public class Date {

	 int dd;
	 int mm;
	 int ccyy;
	 
	 public static void main(String[] args) {
	 Date J=new Date();
	 Scanner sc= new Scanner(System.in);
	 System.out.print("tanggal : ");J.dd=sc.nextInt();
	 System.out.print("bulan : ");J.mm=sc.nextInt();
	 System.out.print("tahun : ");J.ccyy=sc.nextInt();
	 System.out.print(""+J.dd);System.out.print("-"+J.mm);System.out.println("-"+J.ccyy);
	 }
	
}
