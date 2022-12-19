public  abstract class Figura {
    protected double perimetro;
    protected  double area;

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();
}
