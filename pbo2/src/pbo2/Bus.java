package pbo2;

/**
 *
 * @author DIVANA
 */
public class Bus {
    private int penumpang;
    private int maxpenumpang;
    
    //konstruktor kelas bus
    public Bus (int maxPenumpang){
    this.maxpenumpang = maxPenumpang;
    penumpang = 0 ;
    }
    
    //method mutator untuk menampakkan penumpang
    public void addPenumpang(int Penumpang){
    int temp ;
    this.penumpang = Penumpang;
    temp = Penumpang;
    if (temp >= maxpenumpang){
        System.out.println("Penumpang melebihi kuota");
    } else {
    this.penumpang = temp;
    }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang" +penumpang);
        System.out.println("Penumpang Maksimum adalah" +maxpenumpang);
    
    }
}
 