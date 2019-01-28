package com.company;

public class Lingkaran{


    private double phi = 3.14;
    private double jari;
    private double Keliling;

    public void HitungKel(){
        this.Keliling = 2 * phi * jari;;
    }
    public double getjari(){
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getKeliling() {
        return Keliling;
    }
}
