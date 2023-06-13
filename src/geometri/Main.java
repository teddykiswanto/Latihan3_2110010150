
package geometri;


public class Main {
    public static void main(String[] args) {
    Lingkaran teddy1 = new Lingkaran(20);   
    PersegiPanjang teddy2 = new PersegiPanjang(20,30);
    
    System.out.println("Luas Lingkaran : "+teddy1.luas());
    System.out.println("Keliling PersegiPanjang : "+teddy1.keliling());
    
    System.out.println("Luas Lingkaran : "+teddy2.luas());
    System.out.println("Keliling PersegiPanjang : "+teddy2.keliling());
    }
    
    
}
