package pbo;

import java.util.Scanner;

public class biodata {
   public static void main (String [] args){
       Scanner input = new Scanner (System.in);
       String nama, nis, tempat, tanggal, kelamin, alamatmalang, motto;
       System.out.println("----Biodata----");
       System.out.println("Nama Siswa    : ");
       nama = input.nextLine();
       
       System.out.println("NIS           : ");
       nis = input.nextLine();
       
       System.out.println("Tempat Lahir  : ");
       tempat = input.nextLine();
       
       System.out.println("Tanggal Lahir : ");
       tanggal = input.nextLine();
       
       System.out.println("Jenis Kelamin : ");
       kelamin = input.nextLine();
       
       System.out.println("Alamat Malang : ");
       alamatmalang = input.nextLine();
       
       System.out.println("Motto Hidup   : ");
       motto = input.nextLine();
       System.out.println("");
       System.out.println(" ");
       
       System.out.println("-----------------------------------------------");
       System.out.println("---                 BIODATA                 ---");
       System.out.println("-----------------------------------------------");
       System.out.println("Nama          :" +nama);
       System.out.println("NIS           :" +nis);
       System.out.println("Tempat Lahir  :" +tempat);
       System.out.println("Tanggal Lahir :" +tanggal);
       System.out.println("Jenis Kelamin :" +kelamin);
       System.out.println("Alamat Malang :" +alamatmalang);
       System.out.println("Motto Hidup   :" +motto);
       System.out.println("-----------------------------------------------");
   } 
}
