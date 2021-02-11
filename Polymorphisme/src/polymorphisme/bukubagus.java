package polymorphisme;

/**
 *
 * @author ASUS
 */
public class bukubagus implements buku{
    @Override
    public void cover(){
        System.out.println("Cover bergambar matahari");
    }

    @Override
    public void judul() {
        System.out.println("Dengan judul Matahari");
        }

    @Override
    public void bab() {
        System.out.println("Memiliki 15 bab yang menceritakan tentang petualangan sahabat di klan matahari");
        }
    
    public static void main(String[] args) {
        bukubagus it = new bukubagus();
        it.cover();
        it.judul();
        it.bab();
    }
}
