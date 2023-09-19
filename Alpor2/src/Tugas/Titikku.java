package Tugas;

import java.util.Scanner;

public class Titikku {
	int x,y;

    Titikku(){  
    }
    
    Titikku(int X, int Y){
        x=X; y=Y;
    }
    
    void BacaTitik(){
        Scanner sc= new Scanner(System.in);
        System.out.print("x: ");x=sc.nextInt();
        System.out.print("y: ");y=sc.nextInt();
    }
    
    void TulisTitik(){
        System.out.println("Titik: ["+x+","+y+"],");
    }
    
    void MirrorToAbsis(){
        x= (-1) *x;
    }
    
     void MirrorToOrdinat(){
        y= (-1) *y;
    }
     
    public static void main(String[] args) {
        Titikku T= new Titikku();
        Titikku T2= new Titikku(3,4);
      
        Titikku T3=new Titikku();
        T3.BacaTitik();
        T3.TulisTitik();
       
        T.BacaTitik(); 
        T.TulisTitik(); 
        T.MirrorToAbsis();
        T.TulisTitik();
        T.MirrorToOrdinat();
        T.TulisTitik();
        
        int Xr=(T2.x-T.x);
        int Yr=(T2.y-T.y);
        double length=Math.sqrt(Xr*Xr+ Yr*Yr); 
    }
}
