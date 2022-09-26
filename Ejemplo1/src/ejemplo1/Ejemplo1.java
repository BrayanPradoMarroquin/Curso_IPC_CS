/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.lang.Math;
import java.util.Scanner;
import ejemplo1.EjemploClase;
/**
 *
 * @author Usuario
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    
    //En la Clase 3 se separo por metodos y funciones
    static void Clase1(){
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
        
        //EjemploClase alumno = new EjemploClase();
//        EjemploClase alumno2 = new EjemploClase("Roberto");
//        EjemploClase alumno3 = new EjemploClase("Jorge", 23);
//        
//        System.out.println("Hola "+alumno.getNombre());
//        System.out.println("Hola "+alumno2.getNombre() + "con edad "+alumno2.edad);
//        System.out.println("Hola "+alumno3.getNombre() + "con edad "+alumno3.edad);
    }
    
    public static void main(String[] args) {

        Clase1();
        
        //CLASE 2
//        Scanner a = new Scanner(System.in);
//        
//        System.out.println("Elija un mes");
//        int num_mes = a.nextInt(); //1
//        
//        String resultado;
//        
//        resultado = mes(num_mes);  // <- 1
//        //Resultado = Enero
//        System.out.println(resultado);
        
          EjemploClase Figura = new EjemploClase("figura", 0, 0);
          EjemploClase cuadrado = new Cuadrilateros(3, 4, "Rectagulo", 3, 4);
          EjemploClase circulo = new Circulos(4, "Circulo", 0, 0);
          
          System.out.println("El area del cuadrilatero es: "+cuadrado.Area());
          System.out.println("------------------------------------------------");
          System.out.println("El area del circulo es: "+circulo.Area());
    }
    
    //Clase 2
    public static String mes(int mes){ // -> 1
        String meses;
        switch (mes) {
            case 1:
                meses = "Enero";
                break;
            case 2:
                meses = "Febrero";
                break;
            case 3:
                meses = "Marzo";
                break;
            case 4:
                meses = "Abril";
                break;
            default:
                meses = "No existe el mes"+mes;
        }
        return meses; //Enero
    }
}
