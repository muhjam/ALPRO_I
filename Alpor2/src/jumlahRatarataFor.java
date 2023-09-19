

import java.util.Scanner;

public class jumlahRatarataFor {
//	read(N)         
//    jumlah 0       { inisialisasi jumlah deret dengan 0 }
//    for i 1  to N   jumlah  jumlah + i    
//    endfor
//    write(jumlah)
	
//	Menjumlahkan deret 
//    1 + 2 + 3 + … + N
//dengan N adalah bilangan bulat positif. Nilai N dibaca terlebih dahulu
	
	public static void main(String[] args) {

		float i;
		Scanner sc= new Scanner(System.in);
        System.out.print("N : ");float N=sc.nextInt();
		float jumlah=0;
		float ratarata;
		
		for (i=1;i<=N;i++) {
		   jumlah=jumlah+i;
		}
		
		
		System.out.println("Jumlah= "+jumlah);
		
		if(N>0) {
			   ratarata= jumlah/N;
				System.out.println("Ratarata= "+ratarata);
		}else {
			System.out.println("Nilai Rata-rata nya tidak terhingga");	
		}



		

		
	}


}
