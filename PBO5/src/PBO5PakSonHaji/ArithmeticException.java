package PBO5PakSonHaji;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARIFIN
 */
public class ArithmeticException {
    public static void main(String args[])
    {
        //int a=100;
        System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
	int b = console.nextInt();
     
        System.out.println("Enter the value for c");
        
	int c = console.nextInt();
        int res=10/(b-c);
        System.out.println(" The result is "+res);
        
    }

    ArithmeticException(String not_Eligible_for_voting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
