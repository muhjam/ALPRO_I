package Tugas;

import java.util.Scanner;

public class gajipokokkaryawan {
    String nip, gol;
    int masaKerja, gajiPokok, tunjangan, bonus, gajiTotal;
    Scanner scan = new Scanner(System.in);

    void inputData() {
        System.out.print("Input NIP: ");
        nip = scan.next();
        System.out.print("Input Golongan: ");
        gol = scan.next().toUpperCase();
        System.out.print("Input Masa Kerja (Bulan): ");
        masaKerja = scan.nextInt();
    }

    void hitung() {
        switch(gol){
            case "A":
                gajiPokok = 2000000;
                break;
            case "B":
                gajiPokok = 2500000;
                break;
            case "C":
                gajiPokok = 3000000;
                break;
            case "D":
                gajiPokok = 4000000;
                break;
            case "E":
                gajiPokok = 5000000;
                break;
            default:
                gajiPokok = 0;
                System.out.println("Golongan Tidak Ada");
                break;
        }

        tunjangan = gajiPokok * 5 / 100;

        if(gol.equals("D") || gol.equals("E") && masaKerja >= 12) {
            bonus = 500000;
        }
        else {
            bonus = 0;
        }

        gajiTotal = gajiPokok + tunjangan + bonus;
    }

    void printData() {
        System.out.println("==============================");
        System.out.println("NIP : " + nip);
        System.out.println("Golongan : " + gol);
        System.out.println("Masa Kerja : " + masaKerja);
        System.out.println("==============================");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjagan : " + tunjangan);
        System.out.println("Bonus : " + bonus);
        System.out.println("==============================");
        System.out.println("Gaji Total : " + gajiTotal);
    }

    public static void main(String[] args) {
        gajipokokkaryawan orang1 = new gajipokokkaryawan();

        orang1.inputData();
        orang1.hitung();
        orang1.printData();

    }
}
