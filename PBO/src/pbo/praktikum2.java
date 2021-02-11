package pbo;

import java.util.Scanner;

public class praktikum2 {
    public static void main (String[]args){
    //membuat program konversi suhu
    Scanner input = new Scanner (System.in); 
        double c, r, f, k;
        System.out.println("Masukan suhu C = ");
        c = input.nextDouble();
        r = c * 0.8;
        f = c * 1.8 + 32;
        k = c * 273.15;
        
        System.out.println("--------------------");
        System.out.println("-- Konversi suhu  --");
        System.out.println("--------------------");
        System.out.println("Suhu Celcius   = " +c);
        System.out.println("Suhu Reamur    = " +r);
        System.out.println("Suhu Farenheit = " +f);
        System.out.println("Suhu Kelvin    = " +k);
        System.out.println("--------------------");
    }
}
