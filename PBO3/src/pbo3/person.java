package pbo3;

class person {
    private String nama;
    private int usia;
    
    //konstruktor
    public person (String nama, int usia){
    this.nama = nama;
    this.usia = usia;
    }
    //metode
    public void info(){
        System.out.println("nama :" +this.nama);
        System.out.println("usia :" +this.usia);
    }
    
}
