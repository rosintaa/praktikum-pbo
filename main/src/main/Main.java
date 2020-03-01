
package main;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Persegi persegi = new Persegi();
PersegiPanjang pp = new PersegiPanjang();
Segitiga segitiga =new Segitiga();
Lingkaran lingkaran = new Lingkaran();
Kubus kubus = new Kubus();
Silinder silinder = new Silinder();
Balok balok = new Balok();
//persegi.setSisi(5);
//override
//        System.out.println("Luas persegi :"+persegi.luas());
//        System.out.println("Keliling persegi :"+persegi.keliling());
//        
//overload
        System.out.println("1. Persegi");
        System.out.println("Luas persegi : "+persegi.luas(12));
        System.out.println("Keliling persegi : "+persegi.keliling(12));
        System.out.println("2. Persegi Panjang");
        System.out.println("Luas persegi panjang : "+pp.luas(2, 5));
        System.out.println("Keliling Persegi panjang : "+pp.keliling(2, 5));
        System.out.println("3. Segitiga");
        System.out.println("Luas Segitiga : "+segitiga.luas(3,4));
        System.out.println("Keliling Segitiga : "+segitiga.keliling(3,4));
        System.out.println("4. Lingkaran");
        System.out.println("Luas Lingkaran :"+lingkaran.luas(10));
        System.out.println("Keliling Lingakaran : "+lingkaran.keliling(10));
        System.out.println("5. Kubus");
        System.out.println("Volume Kubus : "+kubus.volume(10));
        System.out.println("6. Silinder");
        System.out.println("Volume Silinder : "+silinder.volume(3,5));
        System.out.println("7. Balok");
        System.out.println("Volume Balok : "+balok.volume(3, 4, 5));
        
        
//BangunDatar bangunDatar = new BangunDatar();
    
        //bangunDatar.luas();
        //bangunDatar.setJenis("Persegi");
       // System.out.println(bangunDatar.getJenis());
        
    }
    
}
