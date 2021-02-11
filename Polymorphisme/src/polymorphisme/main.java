package polymorphisme;

public class main {
    public static void main (String[]args){
    
    //mendeklarasikan array dengan tipe manusia
    //dengan kata lain sebagai aray yang menangung objek dari
    //tipe manusia
        manusia [] manusia = new manusia[4];
        
    //perhatikan anda bisa menyimpan subclass apa saja dari
    //tipe manusia di dalam array
        manusia[0]= new siswa();
        manusia[1]= new karyawan();
        manusia[2]= new guru();
        manusia[3]= new programer();
    
    //sekarang ketika anda melakukan loop
    //terhadap array tersebut dan memanggil method dari class manusia
    //maka setiap objek akan melakukan han yang benar atau
    //objec akan menggunakan method yang ada di classnya masing masing
        for(int i=0; i < manusia.length;i++){
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();
            System.out.println();
        }
    }
}
