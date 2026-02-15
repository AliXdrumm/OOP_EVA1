/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author licce
 */
public class CuentaBancaria {
    private String titular;
    private double monto;
    private double depositar;
    private double retirar;
    
    public CuentaBancaria(String titular, double monto){
    this.titular = titular;
    this.monto = monto;
    }
    public void imprimirDatos(){
        System.out.println("----DATOS DEL TITULAR----");
        System.out.println("Titular: " + titular);
        System.out.println("Monto: " + monto);
    }
    public void imprimirSaldo(){
        System.out.println("Tu saldo es de: " + monto);
    }
    public void retirar(double monto){
    if(this.monto >= monto){
        this.monto -= monto;
    }
    else
        System.out.println("----No se puede realizar esa accion------");
    
    }
    public void depositar(double monto){
    if(this.monto >= monto){
        this.monto += monto;
    }else
        System.out.println("----No se puede realizar esa accion----");
    }
   
}
