
package geometri;


public class Lingkaran {
    double radius;
    
    public double luas(){
        return 3.14*radius*radius;
    }
    public double keliling(){
        return 2*3.14*radius;
    }

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public Lingkaran() {
    }
}
