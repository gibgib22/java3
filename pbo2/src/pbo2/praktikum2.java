package pbo2;

public class praktikum2 {
   private double jarijari;
   private double diameter;
   private double luaspermukaan;
   private double volume;
   private double phi;
   
   public void jarijari (double newjari){
       jarijari = newjari;
   }
   
   public void diameter () {
       diameter = 2*jarijari;
       System.out.println("nilai diameter adalah : " + diameter);
   }
   
   public void luaspermukaan () {
       luaspermukaan = 4 * phi * jarijari * jarijari;
       System.out.println("nilai luas permukaan adalah : " +luaspermukaan);
   }
   
   public void volume (){
       volume = 3* phi * jarijari * jarijari * jarijari /4;
       System.out.println("nilai volume bola adalah : " +volume);
   }
   
   public void phi(double newphi){
       phi = newphi;
   }
}
