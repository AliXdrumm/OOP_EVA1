/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_clases;

/**
 *
 * @author licce
 */
public class EVA1_1_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Objetos: --> Instanciación
        //Declaración = Instanciación
        //CLASE identificador = new CLASE(argumentos);
        //new --> crea el objeto en la memoria RAM
        Persona persona1 = new Persona();//REFERENCIA (DIRECCION)
        persona1.nombre = "Juan";
        persona1.apellido = "Perez Jolote";
        persona1.edad = 30;
        persona1.imprimir();
    }
    
}
//Persona --> plantilla de código: NO EXISTE
class Persona{
//Datos (Estado), Variable -----> ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
    //Comportamiento --> Metodos
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
    }
}