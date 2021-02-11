
package polymorphisme;
    class parent {
      int x = 5;
      public void info(){
          System.out.println("Ini Class Parent");
      }
}
    class child extends parent{
        int x = 10;
        public void info (){
            System.out.println("Ini Class Child");
        }
}
public class tes {
    public static void main (String[]args){
        parent tes = new child();
        System.out.println("Nilai x " +tes.x);
        tes.info();
    }
}