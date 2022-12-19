public class Rectangulo  extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
        calcularPerimetro();
        calcularArea();
    }
    @Override
    protected void calcularArea(){area=base*altura;}
    protected void calcularPerimetro(){perimetro=base*2+altura*2;}
}
