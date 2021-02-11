package pbo2;

/**
 *
 * @author DIVANA
 */
public class ujibus {
    public static void main (String[]args){
    //membuat objek busMini dari kelas bus
    Pbo2 busmini = new Pbo2();
    //memasukan nilai jumlah penumpang dan maksimum penumpang ke 
    //dalam objek bus mini
    busmini.penumpang = 5;
    busmini.maxpenumpang = 15;
    //memanggil method cetak pada kelas bus
    busmini.cetak();
    
    //menambahkan penumpang pada bus mini
    busmini.penumpang = busmini.penumpang + 5;
    //memanggil method cetak pada kelas bus
    busmini.cetak();
    
    //mengurangi jumlah penumpang pada bus mini
    busmini.penumpang = busmini.penumpang - 2;
    busmini.cetak();
    
    //menambahkan jumlah penumpang bumini
    busmini.penumpang = busmini.penumpang + 5;
    busmini.cetak();
    }
}
