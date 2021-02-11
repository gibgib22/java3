package pbo2;

import java.util.Scanner;

public class praktikum2b {
    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    
    praktikum2 bola =new praktikum2();
    
        System.out.println("masukkan jari jari");
        double jari = input.nextDouble();
        bola.jarijari(jari);
        bola.diameter();
        bola.phi(3.14);
        bola.luaspermukaan();
        bola.volume();  
    }
}
