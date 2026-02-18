/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class Television {
    Scanner input = new Scanner(System.in);
    private boolean encender;
    private int volumen;
    private int canal = 0;
    
   public int getCanal(){
   return canal;
   }
   
   public void setCanal(int valor){
   valor = this.canal;
   }
   
   public int getVolumen(){
   return volumen;
   }
   
   public void setVolumen(int dato){
   volumen = dato;
   }
   
   public Television(){
       encender = false;
       canal = 0;
       volumen = 0;
   }
   public void prenderApagar(){
  /* if(encender == false)
   encender = true;  
   else
       encender = false;*/
   encender = !encender;
 
   }
   public void verEstadoTele(){
   if(encender == false){
       System.out.println("Encendida");
       System.out.println("Canal: " + canal);
       System.out.println("Volumen: " + volumen);
   }
   else
           System.out.println("Apagada");
   }
   
   
   public void incrementarCanal(){
   canal++;
   }
   
   public void decrementarCanal(){
   canal--;
   }
   
   public void cambiarCanal(int canal){
   this.canal = canal;
   }
   
   public void cambiarVolumen(int volumen){
   this.volumen = volumen;
   if(this.volumen < 0){
 volumen = 0;
     System.out.println("Volumen:" + this.volumen);
   }
   if(this.volumen > 100){
 volumen = 100;
     System.out.println("Volumen: " + volumen);
 }
   }
   
   public void aumentarVolumen(){
   volumen ++;
     }
   
   public void decrementarVolumen(){
   volumen--;
   
   }
   
 public void mostrarCanal(){
     System.out.println("Canal: " + this.canal);
 }
 
 public void mostrarVolumen(){
     System.out.println("Volumen: " + this.volumen);
 }
 
 public void limitesCanal(){
 if(this.canal == 100){
 this.canal = 0;
 }
 if(this.canal == 0){
 this.canal = 100;
 }
 }
 
}
