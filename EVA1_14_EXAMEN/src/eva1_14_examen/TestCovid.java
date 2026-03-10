/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_14_examen;

/**
 *
 * @author licce
 */
public class TestCovid {
    private int edad;
    private boolean cronico;
    private double estatura;
    private double peso;
    
    public TestCovid(){
    this.edad = 30 ;
    this.cronico = false;
    this.estatura = 50;
    this.peso = 1.7;
}
    public TestCovid(int edad, boolean cronico, double estatura, double peso){
    this.edad = edad;
    this.cronico = cronico;
    this.estatura = estatura;
    this.peso = peso;
    }
    
    public int getEdad(){
    return this.edad;
    }
    
    public void setEdad( int valor){
    valor = this.edad;
    }
    
        public boolean getCronico(){
    return this.cronico;
    }
    
    public void setCronico( boolean valor){
    valor = this.cronico;
    }
    
        public double getEstatura(){
    return this.estatura;
    }
    
    public void setEstatura( double valor){
    valor = this.estatura;
    }
    
        public double getPeso(){
    return this.peso;
    }
    
    public void setPeso( double valor){
    valor = this.peso;
    }
    
    private double calcularIMC(){
    return peso / (estatura * estatura);
    }
    
    public String calcularRiesgo(){
    String resu = "Persona sin riesgo";
      if(edad >= 65|| (cronico)|| (calcularIMC() > 30))
          resu = "Persona de riesgo";
        return resu;
              
    }
}
