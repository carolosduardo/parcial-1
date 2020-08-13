
package tda_triangulo;


public class cls_tringulo {
    
    public float area;
    public float base;
    public float altura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
 public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getArea() {
        return area=(this.base*this.altura)/2;
    }
    
    

    
}
