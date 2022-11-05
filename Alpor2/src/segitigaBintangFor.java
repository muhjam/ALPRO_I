

import java.util.Scanner;

public class segitigaBintangFor {

	
	public static void main(String[] args) {

        int i, jumlah, N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
           
        for (i=1; i<=N; i++) {
            for (jumlah=1; jumlah<=i; jumlah++){
                  System.out.print("*");
            }
            System.out.println();
        }

	}
}
