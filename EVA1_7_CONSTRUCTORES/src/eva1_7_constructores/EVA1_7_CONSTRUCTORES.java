/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author licce
 */
public class EVA1_7_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                              //LLAMADA AL CONSTRUCTOR DE LA CLASE
                              //CONSTRUCTOR DEFAULT
        Persona persona = new Persona();
        persona.imprimirDatos();
        
        Persona perso = new Persona("Juan", "Perez Jolote", 29);
        perso.imprimirDatos();
        
    }
    
}
