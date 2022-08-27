/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CLASE 1
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        double suma, resta, multi, div, t, w;
        
        //Elije el primer numero a operar
        System.out.println("Elija el primero numero: ");
        t = a.nextFloat();
        
        //Elije el segundo numero a operar
        System.out.println("Elija el segundo numero: ");
        w = b.nextFloat();
        
        suma = t + w;
        resta = t - w;
        multi = t * w;
        //div = Math.round(t/w) ;
        
        System.out.println("El resultado de la Suma es: "+suma);
        System.out.println("El resultado de la Resta es: "+resta);
        System.out.println("El resultdo de la Multiplicacion es: "+multi);
        //System.out.println(div);
        
        //CLASE 2
        //Trasladar la division a esta area
        if(w==0){
            System.out.println("La operacion no se puede realizar");
        }else{
            System.out.println("El resultado de la division es: "+(t/w));
        }
    }
    
}
