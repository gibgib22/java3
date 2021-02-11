package pbo;

import java.util.Scanner;

public class ifelse {
    public static void main (String[]args){
    Scanner masukkan = new Scanner (System.in);
        System.out.println("Masukan nilai web : ");
        int nilai = masukkan.nextInt();
        if (nilai >= 90){
            System.out.println("Nilai A");
        } else if ( nilai >= 75){
            System.out.println("Nilai B");
        } else if (nilai >= 50) {
            System.out.println("Nilai C");
        } else if (nilai >= 35) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
    
}
