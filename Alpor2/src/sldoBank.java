

import java.util.Scanner;

public class sldoBank {

	
	public static void main(String[] args) {

		 int uang, saldo, kode=0;
	        
		 Scanner sc= new Scanner(System.in);
			System.out.print("Masukan Saldo Awal : ");saldo=sc.nextInt();
			System.out.println();
			
			
			while(saldo>10000&&kode!=2) {
				System.out.println("Masukan kode transaksi:");
				System.out.println("0= Untuk stor tunai");
				System.out.println("1= Untuk tarik tunai");
				System.out.println("2= Untuk keluar");
				
				System.out.print("Masukan kode transaksi : ");kode=sc.nextInt();
				
				if(kode==0) {
					System.out.print("Nominal yang di stor : ");uang=sc.nextInt();
					saldo = saldo + uang;
					System.out.println("Saldo Ahkhir = "+saldo);
					}else if(kode==1){
						System.out.print("Nominal yang di tarik : ");uang=sc.nextInt();
						
						if(saldo-uang<10000){
							System.out.println("Transaksi tidak dapat dilakukan");
						}else {
							saldo = saldo - uang;
						}
						System.out.println("Saldo Ahkhir = "+saldo);
				}else if(kode==2) {
					System.out.println("Transaksi Berhenti");
				}else {
					System.out.println();
					System.out.println("Mohon maaf, transaksi gagal. kode transaksi hanya 0, 1 dan 2");
				}
				System.out.println();
			}
	        
			if(saldo<=10000) {
				System.out.println("Anda tidak dapat melakukan transaksi karena saldo minimal anda tidak mencukupi");
				System.out.println("0= Untuk stor tunai");
				System.out.println("1= Untuk keluar");
				System.out.print("Masukan kode transaksi : ");kode=sc.nextInt();
				if(kode==0) {
					System.out.print("Nominal yang di stor : ");uang=sc.nextInt();
					saldo = saldo + uang;
					System.out.println("Saldo Ahkhir = "+saldo);
					}else if(kode==1) {
						System.out.println("Transaksi Berhenti");
					}else {
						System.out.println();
						System.out.println("Mohon maaf, transaksi gagal. kode transaksi hanya 0 dan 1");
					}
			}
			
			while(saldo>10000&&kode!=2) {
				System.out.println("Masukan kode transaksi:");
				System.out.println("0= Untuk stor tunai");
				System.out.println("1= Untuk tarik tunai");
				System.out.println("2= Untuk keluar");
				
				System.out.print("Masukan kode transaksi : ");kode=sc.nextInt();
				
				if(kode==0) {
					System.out.print("Nominal yang di stor : ");uang=sc.nextInt();
					saldo = saldo + uang;
					System.out.println("Saldo Ahkhir = "+saldo);
					}else if(kode==1){
						System.out.print("Nominal yang di tarik : ");uang=sc.nextInt();
						
						if(saldo-uang<10000){
							System.out.println("Transaksi tidak dapat dilakukan");
						}else {
							saldo = saldo - uang;
						}
						System.out.println("Saldo Ahkhir = "+saldo);
				}else if(kode==2) {
					System.out.println("Transaksi Berhenti");
				}else {
					System.out.println();
					System.out.println("Mohon maaf, transaksi gagal. kode transaksi hanya 0, 1 dan 2");
				}
				System.out.println();
			}
	        


	}
}
