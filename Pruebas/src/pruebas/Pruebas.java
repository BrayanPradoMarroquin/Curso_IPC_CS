/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mario = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){

            System.out.println("1, opcion 1");
            System.out.println("2, opcion 2");
            System.out.println("3, opcion 3");
            System.out.println("4, opcion 4");
            System.out.println("5, opcion 5");
            System.out.println("6, opcion 6");
            System.out.println("7, opcion 7");
            System.out.println("8, opcion 8");
            System.out.println("9, opcion 9");
            System.out.println("10, opcion 10");
            System.out.println("11, salir");
            
            try {
                System.out.println("introduce un numero");  
                opcion = mario.nextInt();
                switch (opcion) {
                    case 6:
                        System.out.println("Hola");
                        ejercicio6();
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        }
    }

    private static void ejercicio6() {
        System.out.println("ejercicio6");
        String name, producton;
        int precio, cantidad, producto, total;
        double totaldesc;
        Scanner nombre = new Scanner(System.in);  
        System.out.println("Buenos dias usuario, ingrese su nombre");   
        name = nombre.nextLine();
        Scanner prod = new Scanner(System.in);  
        System.out.println("Clasifique su producto, 1-frutas, 2-Verduras, 3-abarrotes, 4-otros");   
        producto = prod.nextInt();
        Scanner product = new Scanner(System.in);  
        System.out.println("Como se llama el producto?");   
        producton = product.nextLine();
        Scanner prec = new Scanner(System.in);  
        System.out.println("Ingrese el precio");   
        precio = prec.nextInt();
        Scanner can = new Scanner(System.in);  
        System.out.println("Ingrese la cantidad");   
        cantidad = can.nextInt();
        if (producto == 1){
            totaldesc = precio * cantidad * 0.20;
            System.out.println("Su total a pagar es: "+totaldesc);
        }
        else if(producto == 2){
            totaldesc = precio * cantidad * 0.20;
            System.out.println("Su total a pagar es: "+totaldesc);
        }
        else if (producto == 3){
            totaldesc = precio * cantidad * 0.20;
            System.out.println("Su total a pagar es: "+totaldesc);
        }
        else {
            total = precio * cantidad;
            System.out.println("Su total a pagar es: "+total);
        }
      }
}
