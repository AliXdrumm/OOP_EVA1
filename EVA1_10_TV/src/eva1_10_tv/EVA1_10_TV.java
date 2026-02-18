/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tv;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_10_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner (System.in);
        Television tele = new Television();
        tele.verEstadoTele();
        tele.cambiarVolumen(-1);
        tele.mostrarVolumen();
        
       
    }
}
