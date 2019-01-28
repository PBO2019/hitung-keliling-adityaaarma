package com.company;

public class Main {

   public static void main(String []args){
       Lingkaran bundar = new Lingkaran();


      bundar.setJari(45);
      bundar.HitungKel();

       System.out.println("Keliling Lingkarannya Adalah : "+bundar.getKeliling());

       BujurSangkar kotak = new BujurSangkar();
       kotak.setSisi(34);
       kotak.HitungKel();

       System.out.println("Keliling BujurSangkarnya Adalah : " + kotak.getKeliling());
   }

}
