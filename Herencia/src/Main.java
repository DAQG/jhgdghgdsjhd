import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Rectangulo mirectangulo = new Rectangulo();
        mirectangulo.setX(20);
        mirectangulo.setY(10);
        mirectangulo.calcularPerimetro();
        System.out.println(mirectangulo.getPerimetro());
        mirectangulo.area();
        System.out.println(mirectangulo.getArea());
        System.out.println("-----------------------------------");

        Cuadrado micuadrado= new Cuadrado();
        micuadrado.setX(4);
        micuadrado.setY(4);
        micuadrado.calcularPerimetro();
        micuadrado.area();
        System.out.println(micuadrado.getPerimetro());
        System.out.println(micuadrado.getArea());
        ColorTriangulo t1=new ColorTriangulo("Azul",  "Estilo x",8.0,  12.0);
        ColorTriangulo t2=new ColorTriangulo( "Rojo", "Estilo y", 4.0 , 3.0);
        System.out.println("Datos deñ triangulo 1");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        t1.mostrarColor();
        System.out.println("Su area es: " + t1.area());
        System.out.println("Datos del triangulo 2");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        t2.mostrarColor();
        System.out.println("Su area es: " +t2.area());*/
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor del cuadrado: ");
        double longitudLado=lectura.nextDouble();

        Cuadrado micuadrado= new Cuadrado(longitudLado);
        System.out.println(micuadrado.getArea());
        System.out.println(micuadrado.getPerimetro());

        System.out.println("Ingrese la base del rectangulo ");
        double longitudBase=lectura.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double longitudAltura=lectura.nextDouble();
        Rectangulo mirectangulo=new Rectangulo(longitudBase,longitudAltura);
        System.out.println(mirectangulo.getArea());
        System.out.println(mirectangulo.getPerimetro());

        System.out.println("Ingrese la base del Triangulo ");
        double longitudt=lectura.nextDouble();
        System.out.println("Ingrese la altura del Triangulo: ");
        double longitudA=lectura.nextDouble();
        Triangulo mitriangulo= new Triangulo(longitudt,longitudA);
        System.out.println(mitriangulo.getArea());
        System.out.println(mitriangulo.getPerimetro());

    }
}