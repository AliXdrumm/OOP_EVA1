/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_areas;

/**
 *
 * @author licce
 */
public class EVA1_13_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area del Cuadrado: " + Areas.areaCuad(5) + " cm^2");
        System.out.println("Area del Rectangulo: " + Areas.areaRect(3, 4) + " cm^2");
        System.out.println("Area del Triangulo: " + Areas.areaTriang(3, 7) + " cm^2");
        System.out.println("Area del Circulo: " + Areas.areaCirc(9) + " cm^2");
        System.out.println("Area del Rombo: " + Areas.areaRomb(6, 2) + " cm^2");
        System.out.println("Area del Trapecio: " + Areas.areaTrape(4, 3, 9) + " cm^2");
        System.out.println("Perimetro del Cuadrado: " + Perimetros.perimetroCuadr(4) + "cm");
        System.out.println("Perimetro del Rectangulo: " + Perimetros.perimetroRecta(4, 5) + "cm");
        System.out.println("Perimetro del Triangulo: " + Perimetros.perimetroTriang(6) + "cm");
        System.out.println("Perimetro del Circulo: " + Perimetros.perimetroCirc(12) + "cm");
    }
    class Areas{
    public static double areaCuad(double lado){
    double resu;
    resu = lado * lado;
    return resu;
    }
    public static double areaRect(double lado1, double lado2){
    double resu;
    resu = lado1 * lado2;
    return resu;
    }
    public static double areaTriang(double base, double altura){
    double resu;
    resu = (base * altura)/2;
    return resu;
    }
    public static double areaCirc(double radio){
    double resu;
    resu = Math.PI * (radio * radio);
    return resu;
    }
    public static double areaRomb(double diagonalM, double diagonalm){
    double resu;
    resu = (diagonalM * diagonalm)/2;
    return resu;
    }
    public static double areaTrape(double baseM, double basem, double altura){
    double resu;
    resu = ((baseM + basem) * altura) / 2;
    return resu;
    }
    
    }
    class Perimetros{
    public static double perimetroCuadr(double lado){
    double resu;
    resu = 4*lado;
    return resu;
    }
    public static double perimetroRecta(double ladoA, double ladoB){
    double resu;
    resu = (2 * ladoA) + (2 * ladoB);
    return resu;
    }
    public static double perimetroCirc(double diametro){
    double resu;
    resu = Math.PI * diametro;
    return resu;
    }
    public static double perimetroTriang(double lado){
    double resu;
    resu = 3 * lado;
    return resu;
    }
    }
}
