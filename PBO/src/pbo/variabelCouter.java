package pbo;

import java.util.Scanner;

public class variabelCouter {
    public static void main (String[]args){
        Scanner masuk = new Scanner (System.in);
        System.out.println("Masukan batas bilangan : ");
        int batas = masuk.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++){
        hasil += i;
            System.out.println("Total jumlahnya adalah : " +hasil+ "cm");
        }
    }
}
