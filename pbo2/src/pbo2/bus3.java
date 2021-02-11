package pbo2;

/**
 *
 * @author DIVANA
 */
public class bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public bus3(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //Method mutator
    public void Addpenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        } 
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = " +penumpang);
        System.out.println("maksimum penumpang yang seharusnya adalah :" +maxpenumpang);
    }
    
}
