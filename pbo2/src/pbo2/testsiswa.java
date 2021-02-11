package pbo2;

/**
 *
 * @author DIVANA
 */
public class testsiswa {
    public static void main (String args[]){
    encapsiswa siswa = new encapsiswa();
    siswa.setNama("DIVANA");
    siswa.setAge(11);
    siswa.getAddress("Malang");
    
        System.out.println("Nama : " +siswa.getNama()
        + "Absen : " +siswa.getAbsen()
        + "Address : " +siswa.getAddres());
    }
}
