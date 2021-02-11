package polymorphisme;

/**
 *
 * @author ASUS
 */
public class main2 {
        public static void main (String[]args){
        makanan [] makanan = new makanan[3];

        makanan[0]= new makanan();
        makanan[1]= new buburAyam();
        makanan[2]= new geprekAyam();
  
        for(int i=0; i < makanan.length;i++){
            makanan[i].rasa();
            makanan[i].tekstur();
            makanan[i].harga();
            System.out.println();
        }
    }
}
