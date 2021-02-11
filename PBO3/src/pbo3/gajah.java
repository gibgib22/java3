package pbo3;

/**
 *
 * @author ASUS
 */
public class gajah extends hewan{
    public static void testClassMethod(){
        System.out.println("The Class method in Hewan..");
    }
    //meng override method pada class animal
    public void leslInslanceMethod(){
        System.out.println("The inlance method in gajah..");
    }
    public static void main (String[]args){
        gajah myGajah = new gajah();
        hewan myHewan = new hewan();
        hewan.teatClassMethod();
        myHewan.testIntanceMethod();
    }
}
