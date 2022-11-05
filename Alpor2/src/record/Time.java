package record;
import java.util.Scanner;

public class Time {
	
		int hh;
	 int mm;
	 int ss;
	 public static void main(String[] args) {
	 long TotalInSS;
	 Time J=new Time();
	 Scanner sc= new Scanner(System.in);
	 System.out.print("hh : ");J.hh=sc.nextInt();
	 System.out.print("mm : ");J.mm=sc.nextInt();
	 System.out.print("ss : ");J.ss=sc.nextInt();

	System.out.print(""+J.hh);System.out.print(":"+J.mm);System.out.println(":"+J.ss);
	 TotalInSS = (J.hh*3600) + (J.mm*60) + J.ss;
	 System.out.println("Dalam total detik= "+TotalInSS);
	 }

}
