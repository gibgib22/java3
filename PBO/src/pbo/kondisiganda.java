package pbo;

import java.util.Scanner;

public class kondisiganda {
    public static void main(String[]args){
    Scanner masuk = new Scanner(System.in);
        System.out.println("Masukan Nilai TPAI");
        int TPA = masuk.nextInt();
        System.out.print("Masukan nilai Bahasa Inggris: ");
        int BahasaInggris = masuk.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)){
            System.out.println("Siswa Dapat Beasiswa");
        } else {
            System.out.println("Siswa tidak dapat beasiswa");} 
            
    }
    
}
