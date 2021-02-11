package pbo;

import java.util.Scanner;

public class pernyataanif {
    public static void main (String[]args){
     Scanner masukkan = new Scanner (System.in);
     int nilai;
        System.out.println("masukan nilai pbo : ");
        nilai = masukkan.nextInt();
        if (nilai < 70)
            System.out.println("Siswa tidak lulus");
        if (nilai > 70)
            System.out.println("Siswa lulus");
    }
    
}
