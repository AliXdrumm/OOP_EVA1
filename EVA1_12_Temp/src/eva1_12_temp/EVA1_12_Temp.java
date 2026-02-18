/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temp;

/**
 *
 * @author licce
 */
public class EVA1_12_Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Temperatura temp = new Temperatura();
        System.out.println("50 C = " + Temperatura.centAfahr(50) + " F");
        System.out.println("50 F = " + Temperatura.FahrACen(50) + " C");
        System.out.println("50 C = " + Temperatura.CelsAkelv(50) + " K");
        System.out.println("50 K = " + Temperatura.kelvAcels(50) + " C");
        System.out.println("50 F = " + Temperatura.fahrAkelv(50) + " K");
        System.out.println("50 K = " + Temperatura.kelvAfahr(50) + " F");
        
    }
    class Temperatura{
    public static double centAfahr(double cent){
    double resu;
    resu = cent * (9.0/5.0) + 32;
    return resu;
    }
    
    public static double FahrACen(double fahr){
    double resu;
    resu = (5.0/9.0) * (fahr + 32);
    return resu;
    }
    
    public static double CelsAkelv(double cel){
    double resu;
    resu = cel + 273.15;
    return resu;
    }
    
    public static double kelvAcels(double kelv){
    double resu;
    resu = kelv - 273.15;
    return resu;
    }
    public static double fahrAkelv(double fahr){
    double resu;
    resu = (5.0/9.0) * (fahr - 32) + 273.15;
    return resu;
    }
    public static double kelvAfahr(double kelv){
    double resu;
    resu = (9.0/5.0) * (kelv - 273.15) + 32;
    return resu;
    }
    }
}
