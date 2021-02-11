package pbo3;

/**
 *
 * @author DIVANA
 */
public class B extends A{
    private int b;
    
    public void setB (int nilai){
        b = nilai;
    }
    
    public int getB () {
        return b;
    }
    
    //melakukan override terhadap method tampilkanNilai ()
    //yang terdapat pada kelas A
    
    public void tampilkanNIlai(){
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
    }
}
