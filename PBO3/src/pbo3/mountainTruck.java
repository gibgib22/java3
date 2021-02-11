
package pbo3;

/**
 *
 * @author ASUS
 */
public class mountainTruck extends truck {
    public int seatHeight;
    public mountainTruck (int startHeight,int startSpeed,int startGear, int startCadence){
        super (startCadence,startSpeed,startGear);
        seatHeight = startHeight;
    }
    public void setHeight (int newValue){
        seatHeight = newValue;
    }
    public static void main (String [] aku){
        System.out.println("mulai bejalan");
        mountainTruck MB = new mountainTruck (0,0,0,0);
        System.out.println("gear : " +MB.gear);
        System.out.println("speed : " +MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear :" +MB.gear);
        System.out.println("speed :" +MB.speed);
        MB.speedUp(2);
        System.out.println("gear :" +MB.gear);
        System.out.println("speed :" +MB.speed);
    }
}
