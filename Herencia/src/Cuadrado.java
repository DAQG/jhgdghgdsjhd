import java.lang.*;
public class Cuadrado  extends Figura{
    private double lado;

    public Cuadrado(double lado){
        this.lado=lado;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea(){
        area=lado*lado*100;

    }
    @Override
    protected void calcularPerimetro(){
        perimetro=lado *4 * 100;
    }
}
