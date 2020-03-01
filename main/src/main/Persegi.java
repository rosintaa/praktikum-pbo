
package main;


public class Persegi extends BangunDatar{

    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
    @Override
    public double luas() {
        return this.sisi*this.sisi; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double keliling() {
        return 4*this.sisi; //To change body of generated methods, choose Tools | Templates.
    }
    //overload
    public double luas(double sisi){
        return sisi*sisi;
    }
    public double keliling(double sisi){
        return 4*sisi;
    }
    
}
