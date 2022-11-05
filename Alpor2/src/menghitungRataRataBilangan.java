

import java.util.Scanner;

public class menghitungRataRataBilangan {

	
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int i, n;
	        float jum, x, rata;
	        System.out.print ("Banyaknya Data: ");
	        n = sc.nextInt();
	        jum=0;
	        i=1;
	        while (i<=n){
	                System.out.print ("Data ke-"+i+": ");
	                x=sc.nextFloat ();
	                jum += x;
	                i++;
	        }
	        rata = jum / n;
	        System.out.println ("Rata-rata: "+rata);
	        System.out.println ("Jumlah: "+jum);
	   }
}
