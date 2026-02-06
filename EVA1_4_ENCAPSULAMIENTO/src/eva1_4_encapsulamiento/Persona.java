/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_encapsulamiento;

/**
 *
 * @author licce
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //CONSTRUCTORES
    //COMPORTAMIENTO (MÉTODOS) //intermediario --> interfaz
    //get y set
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    
    }
    public String getApellidos(){
    return apellidos;
    
    }
    public void setApellidos(String valor){
    apellidos = valor;
    
    }
    public int getEdad(){
    return edad;
    
    }
    public void setEdad(int valor){
    edad = valor;
    
    }
    public char getGenero(){
    return genero;
    
    }
    public void setGenero(char valor){
    genero = valor;
    
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre: " + apellidos);
        System.out.println("Nombre: " + edad);
        System.out.println("Nombre: " + genero);
    }
    public String nombreCompleto(){
    
        return nombre + " " + apellidos;
    
    }
}
