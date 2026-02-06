/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_encapsulamiento;

/**
 *
 * @author licce
 */
public class EVA1_4_ENCAPSULAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Alan Armando");
        persona.setApellidos("Rodríguez Jiménez");
        persona.setEdad(18);
        persona.setGenero('H');
        
        System.out.println("Nombres: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Genero: " + persona.getGenero());
        System.out.println("Nombre completo: " + persona.nombreCompleto());
    }
    
}
