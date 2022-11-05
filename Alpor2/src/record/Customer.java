package record;
import java.util.Scanner;

public class Customer {

		 String noacc, nama,alamat, kota,notelp;
		 Double saldo;

		 public static void main(String[] args) {
		 Customer C=new Customer();
		 Scanner sc= new Scanner(System.in);
		 System.out.print("no acc : ");C.noacc=sc.next();
		 System.out.print("nama : ");C.nama=sc.next();
		 System.out.print("alamat : ");C.alamat=sc.next();
		 System.out.print("kota : ");C.kota=sc.next();
		 System.out.print("notelp : ");C.notelp=sc.next();
		 System.out.print("saldo : ");C.saldo=sc.nextDouble();
		 System.out.println("Data Nasabah "+ C.noacc+"\n"+C.nama+"\n"+C.saldo+"\n"+C.alamat+"\n"+C.kota+"\n"+C.notelp);
		 }
	
	
}
