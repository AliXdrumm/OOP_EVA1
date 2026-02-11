/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_6_Formato_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             Referencias libro = new Referencias();
             System.out.println(" ");
             System.out.println("Referencias");
             libro.setAutor("Alan Rodriguez");
             libro.setTitulo("Como sobrevivir a Orientada a objetos");
             libro.setDia(12);
             libro.setMes("Enero");
             libro.setYear(2016);
             libro.setCiudad("Chihuahua");
             libro.setEditorial("Libreria de libros");
             libro.imprimirDatos();
            
             Referencias libro2 = new Referencias();
             System.out.println(" ");
             System.out.println("Referencias");
             libro2.setAutor("Carlos Noche");
             libro2.setTitulo("Como ser un dios en la programacion");
             libro2.setDia(23);
             libro2.setMes("Octubre");
             libro2.setYear(2025);
             libro2.setCiudad("Oklahoma");
             libro2.setEditorial("Read for your right");
             libro2.imprimirDatos();
             
             Referencias libro3 = new Referencias();
             System.out.println(" ");
             System.out.println("Referencias");
             libro3.setAutor("Reyes Kevin");
             libro3.setTitulo("Existen los aliens y nos suenan?");
             libro3.setDia(01);
             libro3.setMes("Marzo");
             libro3.setYear(2006);
             libro3.setCiudad("Madrid");
             libro3.setEditorial("Que patine la risa!");
             libro3.imprimirDatos();
    }
    
}
