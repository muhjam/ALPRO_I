package tugas.func;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

class gaji{

    String nama;
    char gol;
    int abdi;
    Double gatot, gapok, tunj,bonus ;
    DecimalFormat IDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    // Cetak Gaji
    void cetakGaji(){
        switch(gol){
            case 'A' : 
                    gapok=2000000.0;
                    tunj= gapok * 0.05;
                    break;
            case 'B' :
                    gapok=2500000.0;
                    tunj= gapok * 0.05 ;
                    break;
            case 'C' :
                    gapok=3000000.5;
                    
                    break;
            case 'D' :
                    gapok=4000000.5;
                    
                    break;
            case 'E' :
                    gapok=5000000.5;
                    
                    break;
            default :
                    System.out.println("Golongan tidak ada!"+gol);

        }
        if(abdi>12 && (gol == 'D' || gol == 'E') ){
            bonus=500000.0;
        } else{
            bonus=0.0;
        }
        tunj=gapok * 0.05;
        gatot=(double) (gapok+tunj+bonus);

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        IDR.setDecimalFormatSymbols(formatRp);

        
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Rician Gaji Atas Nama: "+nama);
        System.out.println("");
        System.out.println("-------------------------------------------------");


        System.out.println("Nama           : "+nama);
        System.out.println("Gaji Pokok     : "+ IDR.format(gapok));
        System.out.println("Tunjangan       :"+ IDR.format(tunj));
        System.out.println("Bonus          : "+ IDR.format(bonus));
        System.out.println("Gaji Diterima  : "+IDR.format(gatot));
    }


    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        gaji g1, g2, g3;

        // Instalasi Obj
        g1 = new gaji();
        g2 = new gaji();
        g3 = new gaji();

                // Mengisi data u/ Obj g1
        System.out.println("MASUKAN NAMA KARYAWAN (1/3)");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukan Nama      : "); g1.nama=s.next();
        System.out.print("Masukan Golongan  : "); g1.gol=s.next().charAt(0);
        System.out.print("Masa kerja        : "); g1.abdi=s.nextInt();
        g1.cetakGaji();

                // Mengisi data u/ Obj g2
        System.out.println("MASUKAN NAMA KARYAWAN (2/3)");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukan Nama      : "); g2.nama=s.next();
        System.out.print("Masukan Golongan  : "); g2.gol=s.next().charAt(0);
        System.out.print("Masa kerja        : "); g2.abdi=s.nextInt();
        g2.cetakGaji();

                // Mengisi data u/ Obj g3
        System.out.println("MASUKAN NAMA KARYAWAN (3/3)");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukan Nama      : "); g3.nama=s.next();
        System.out.print("Masukan Golongan  : "); g3.gol=s.next().charAt(0);
        System.out.print("Masa kerja        : "); g3.abdi=s.nextInt();
        g3.cetakGaji();

        // g1.cetakGaji();
        // g2.cetakGaji();
        // g3.cetakGaji();

    }
}
