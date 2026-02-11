/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author licce
 */
public class EVA1_5_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Vehiculo vehiculo = new Vehiculo();
        
        /*vehiculo.setMarca("Mazda");
        vehiculo.setModelo("Mustang");
        vehiculo.setYear(2010);
        vehiculo.setColor("Azul");
        vehiculo.setKilometro(1000000);
        vehiculo.setPrecio(12000000);
        vehiculo.imprimirDatos();*/
        Vehiculo [] agencia = new Vehiculo [10];
        for (int i = 0; i < agencia.length; i++) {
            agencia[i] = new Vehiculo();
            System.out.println("-----Datos del vehiculo-----");
        agencia[i].setMarca("Ford");
        agencia[i].setModelo("Mustang");
        agencia[i].setYear(2010);
        agencia[i].setColor("Azul");
        agencia[i].setKilometro(1000000);
        agencia[i].setPrecio(1200000);
        agencia[i].imprimirDatos();
            
        }
    }
    
}
