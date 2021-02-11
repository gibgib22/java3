package pbo3;

/**
 *
 * @author ASUS
 */
class employ extends person {
    private String nokaryawan;
    //konstruktor
    public employ(String nokaryawan, String nama, int usia) {
        super(nama, usia);
        this.nokaryawan = nokaryawan;
    }
    //metode
    public void info (){
        System.out.println("No. karyawan : " +this.nokaryawan);
        super.info();
    }
}
