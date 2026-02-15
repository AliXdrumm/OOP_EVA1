/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author licce
 */
public class EVA1_9_Cuenta_Bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria("Alan Rodriguez", 1000000);
        cuenta.imprimirSaldo();
        cuenta.depositar(3);
        cuenta.retirar(2);
        cuenta.imprimirSaldo();
    }
    
}
