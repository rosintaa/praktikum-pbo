
package main;


public class Segitiga extends BangunDatar {
    private double alas,tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

//    @Override
//   public double luas() {
//        return this.alas*this.tinggi; //To change body of generated methods, choose Tools | Templates.
//    }
    public double luas(double alas, double tinggi){
        return alas*tinggi/2;
    }
    public double keliling(double alas, double tinggi){
        
        return alas+tinggi+(Math.sqrt((alas*alas)+(tinggi*tinggi)));
    }
    
    
    
}
