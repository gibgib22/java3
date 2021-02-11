package pbo2;

import java.util.Scanner;

public class praktikum {
    public static void main (String[]abc){
        Scanner input = new Scanner (System.in);
        int nambah, nambahBerat;
        
        System.out.print("inputkan maxpenumpang: ");
        int penumpang = input.nextInt();
        praktikum1 bus = new praktikum1(penumpang);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        System.out.println("");
        
        System.out.println("Akan berhenti brp halte : ");
        int halte = input.nextInt();
        for(int i=1;i<=halte;i++){
            System.out.println("");
            System.out.print("tambahkan penumpang pada halte "+i+" : ");
            nambah = input.nextInt();
            System.out.print("tambahkan berat penumpang pada halte "+i+" : ");
            nambahBerat = input.nextInt();
            bus.addPenumpang(nambah);
            bus.berat(nambahBerat);
            bus.cetakpenumpang();
        }
   }
}
