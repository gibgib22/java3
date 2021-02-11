package pbo;

import java.util.Scanner;

public class praktikum3 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    String hari, ape;
        System.out.println("------------------------------------------");
        System.out.println("--           JADWAL PELAJARAN           --");
        System.out.println("------------------------------------------");
        
        System.out.println("--         Masukan data diri anda       --");
        System.out.print("Nama     : ");
        String nama = input.nextLine();
        System.out.print("Kelas    : ");
        String kelas = input.nextLine();
        System.out.print("No absen : ");
        int absen = input.nextInt();
        do {
            System.out.println("        Apa yang akan anda lakukan      ");
            System.out.print("Liha jadwal / tambah jadwal: ");
            System.out.println("");
            String jadwal = input.next();

            if (jadwal.equals("lihat")){
                     System.out.println("------------------------------------------");
                     System.out.println("--        JADWAL PELAJARAN ANDA         --");
                     System.out.println("------------------------------------------");
                     System.out.println("1. Kimia");
                     System.out.println("2. Fisika");
                     System.out.println("3. Biologi");
                     System.out.println("4. Matematika");

            } else {
                System.out.println("Masukan jadwal anda : ");
                System.out.println("1. ");
                String jadwal2 = input.nextLine();
                System.out.println("2. ");
                String jadwal3 = input.nextLine();
                System.out.println("3. ");
                String jadwal4 = input.nextLine();
                System.out.println("4. ");
                String jadwal5 = input.nextLine();


                System.out.println("------------------------------------------");
                System.out.println("--        JADWAL PELAJARAN ANDA         --");
                System.out.println("------------------------------------------");
                System.out.println("1. " +jadwal2);
                System.out.println("2. " +jadwal3);
                System.out.println("3. " +jadwal4);
                System.out.println("4. " +jadwal5);
                System.out.println("------------------------------------------");
            } 
            System.out.println("apakah ada yang anda ingin lakukan kembali ? (jawab ya atau tidak)");
            ape = input.next();
        } while (ape.equals("ya"));
    }
}
