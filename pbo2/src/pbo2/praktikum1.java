package pbo2;

/**
 *
 * @author DIVANA
 */
public class praktikum1 {
    
    public double penumpang;
    public double maxPenumpang;
    public double berat;
    public double rata;
    public double penumpangbaru;
    
    public praktikum1(double maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang (double penumpang)
    {
        double temp;
        temp =  this.penumpang+penumpang;
        if (temp > maxPenumpang)
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
    public void berat(double berat)
    {
     double totalBerat, rata;
     totalBerat = this.berat + berat;
     this.berat = totalBerat;
     rata = this.berat/this.penumpang;
     this.rata = rata;
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = " +penumpang);
        System.out.println("Berat Penumpang = " +berat);
        System.out.println("Rata-rata berat penumpang = " +rata);
        System.out.println("maksimum penumpang yang seharusnya adalah :" +maxPenumpang);
    }
        
}
