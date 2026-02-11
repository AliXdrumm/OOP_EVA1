/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author licce
 */
public class Referencias {
    private String autor;
    private String titulo;
    private int dia;
    private String mes;
    private int year;
    private String ciudad;
    private String editorial;
   
   public String getAutor(){
   return autor;
   
   }
   public void setAutor(String valor){
   autor = valor;
   }
   public String getTitulo(){
   return titulo;
   
   }
   public void setTitulo(String valor){
   titulo = valor;
   }
   public int getDia(){
   return dia;
   
   }
   public void setDia(int valor){
   dia = valor;
   }
   public String getMes(){
   return mes;
   
   }
   public void setMes(String valor){
   mes = valor;
   }
   public int getYear(){
   return year;
   
   }
   public void setYear(int valor){
   year = valor;
   }
   public String getCiudad(){
   return ciudad;
   
   }
   public void setCiudad(String valor){
   ciudad = valor;
   }
   public String getEditorial(){
   return editorial;
   
   }
   public void setEditorial(String valor){
   editorial = valor;
   }
   public void imprimirDatos(){
       System.out.println(autor + "." + "(" + dia + " " + mes + " " + year + ")." + titulo + "." + ciudad + ": " + editorial);
   
   }
}
