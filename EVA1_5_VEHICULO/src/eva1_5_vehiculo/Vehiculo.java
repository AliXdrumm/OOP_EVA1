/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author licce
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private int kilometraje;
    private double precio;
    
    public String getMarca(){
return marca;
}

public void setMarca(String valor){
marca = valor;
}

public String getModelo(){
return modelo;
}
public void setModelo(String valor){
modelo = valor;
}
public int geYear(){
return year;
}
public void setYear(int valor){
year = valor;
}
public String getColor(){
return color;
}
public void setColor(String valor){
color = valor;
}
public int getKilometro(){
return kilometraje;
}
public void setKilometro(int valor){
kilometraje = valor;
}
public double getPrecio(){
return precio;
}
public void setPrecio(double valor){
precio = valor;
}
public void imprimirDatos(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + year);
    System.out.println("Color: " + color);
    System.out.println("Kilometraje: " + kilometraje);
    System.out.println("Precio: " + precio);
    
}
}


