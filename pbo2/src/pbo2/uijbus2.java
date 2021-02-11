package pbo2;

/**
 *
 * @author DIVANA
 */
public class uijbus2 {
    public static void main (String[]args){
    //membuat objek bus besar
    Bus busbesar = new Bus(40);
    busbesar.cetak();
    
    //penambahan penumpang
    busbesar.addPenumpang(15);
    busbesar.cetak();
    
    //penambahan penumpang
    busbesar.addPenumpang(5);
    busbesar.cetak();
    
    //penambahan penumpang
    busbesar.addPenumpang(26);
    busbesar.cetak();
    }
}
