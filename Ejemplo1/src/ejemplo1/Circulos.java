/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Usuario
 */
public class Circulos extends EjemploClase{
    public int radio;

    public Circulos(int radio, String nombre, int lado, int cant_lados) {
        super(nombre, lado, cant_lados);
        this.radio = radio;
    }
    
    @Override
    public int Area(){
        return (int) (Math.PI*Math.pow(radio, 2));
    }
    
        @Override
    public int Volumnen(){
        return  (int) ((4/3)*Math.PI*Math.pow(radio, 3));
    }
    
        @Override
    public int Perimetro(){
        return (int) (2*Math.PI*radio);
    }
}
