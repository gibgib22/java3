package pbo;

import java.util.Scanner;

public class keybord {
    public static void main (String[]args){
    Scanner masukan = new Scanner (System.in);
    int a, b;
        System.out.println("masukan nilai a : ");
        a = masukan.nextInt();
        System.out.println("masukan nilai b : ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("nilai variabel yang ada pada program : ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    
}
