package pbo;

import java.util.Scanner;

public class praktikum {
    public static void main (String [] args){
    //tugas 1 menghitung luas permukaan bola
    Scanner input = new Scanner (System.in);
    double r, phi, hasil;
        System.out.println("================================");
        System.out.println("===                          ===");
        System.out.println("== hitung luas permukaan bola ==");
        System.out.println("===                          ===");
        System.out.println("================================");
    phi = 3.14;
        System.out.println("======= masukan nilai r ========");
        
        System.out.print("r : ");
    r = input.nextDouble();
    hasil = 4*r*r*phi;
        System.out.println("luas permukaan : " + hasil + "cm");
    }
}
