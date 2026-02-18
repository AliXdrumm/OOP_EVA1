/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_static;

/**
 *
 * @author licce
 */
public class EVA1_11_Static {

    /**
     * param args the command line arguments
     */
    public int x = 100;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******MATH*****");
        System.out.println("PI= "+ Math.PI);
        System.out.println("Random= " + Math.random());
        System.out.println("Cuadrados(5)" + Math.pow(5, 2));
        System.out.println("++++++Matematicas++++++");
        System.out.println("PI= " + Matematicas.PI);
        //Matematicas mate = new Matematicas();
        //System.out.println("PI= " + mate.PI);
        Matematicas mate = new Matematicas();
        System.out.println("Cuadrado de 5 = " + mate.cuadrado(5));
        EVA1_11_Static obj = new EVA1_11_Static();
        System.out.println("X = " + obj.x);
    }
    
}
//static --> nos sirve para crear utilerias, sin necesidad de crear objetos
class Matematicas{
public static final double PI = 3.1416;
public double cuadrado(double valor){
return valor * valor;
}
}