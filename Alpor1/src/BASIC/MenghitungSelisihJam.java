
package BASIC;

import java.util.Scanner;

public class MenghitungSelisihJam {

	public static void main(String[] args) {

        int h1, m1, s1, h2,m2, s2, sj, sh, sm,ss;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("H1= ");h1=sc.nextInt();
        System.out.print("M1= ");m1=sc.nextInt();
        System.out.print("S1= ");s1=sc.nextInt();
        System.out.print("H2= ");h2=sc.nextInt();
        System.out.print("M2= ");m2=sc.nextInt();
        System.out.print("S2= ");s2=sc.nextInt();
        

        sj=(h2*3600+m2*60+s2)-(h1*3600+m1*60+s1);
        
        sh=sj/3600;
        sm= (sj%3600)/60;
        ss= (sj%3600)%60;
        
        System.out.println("Dalam Detik= "+sj);
        System.out.println("Dalam Jam = "+sh+":"+sm+":"+ss);
		
	}

}
