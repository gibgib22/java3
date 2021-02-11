package pbo2;

/**
 *
 * @author DIVANA
 */
public class ujibus3 {
    public static void main (String[]abc){
   
    bus3 bus = new bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.Addpenumpang(3);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.Addpenumpang(1);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.Addpenumpang(3);
        bus.cetakpenumpang();
    }
}
