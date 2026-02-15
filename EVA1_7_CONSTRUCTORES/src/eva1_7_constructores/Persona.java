/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author licce
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    
    //CONSTRUCTORES
    public Persona(){//CONSTRUCTOR DEFAULT
        //Inicializar
        nombre = "--------";
        apellido = "-------";
        edad = -1;
        System.out.println("LLAMADA AL CONSTRUCTOR DEFAULT");
    
    }
           //FIRMA
    public Persona(String nombre, String apellido, int edad){
        //INICIALIZAR
        //this. --> Operador para acceder al contenido del objeto actual
        //permite visualizar todo lo que esté definido en la clase
        //SIN INPORTAR QUE MODIFICADOR TENGA
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    
    }
    //METODOS O COMPORTAMIENTO
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    nombre = valor;
    }
    public String getApellido(){
    return apellido;
    }
    public void setApellido(String valor){
    apellido = valor;
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
    edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("----Datos de la persona----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}
