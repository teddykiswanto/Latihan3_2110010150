
package geometri;


public class PersegiPanjang {
    double panjang, lebar;
    
    public double luas(){
        return 3.14*(panjang +lebar);
    }
    public double keliling(){
        return 2*(panjang+lebar);
    }

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
}
