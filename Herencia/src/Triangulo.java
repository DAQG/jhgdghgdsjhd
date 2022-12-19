public    class Triangulo extends  Figura{
    private double base;
    private double altura;


    public Triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
        calcularArea();
        calcularPerimetro();

    }
    @Override
    protected void calcularArea(){area=base*altura/2;}
    @Override
    protected  void calcularPerimetro(){perimetro=base*3;}
}



 /*public class Triangulo  extends  DosDimensiones{
    private String estilo;
    Triangulo(){
        super();
        estilo="ninguno";
    }
    Triangulo(String s,double b, double h){
        super (b,h);
        estilo=s; //estilo es un atributo local.
    }
    Triangulo(double x){
        super(x);
        estilo="Estilo nuevo";
    }
    double area(){
       return getAltura()*getBase()/2;
    }
    void mostrarEstilo(){
        System.out.println("El triangulo tiene "  +  estilo);
    }
}*/
