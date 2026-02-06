/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_3_packages;
import OtroPaquete.Persona;
/**
 *
 * @author licce
 */
public class EVA_1_3_PACKAGES {

    public static void main(String[] args) {
      Persona persona = new Persona();
      //persona. //Los atributos son default, no son accesibles (diferente paquete)
      Automovil auto = new Automovil();
      //auto.marca //Atributos son default, son accesibles (mismo paquete)
    }
    
}
