/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Usuario
 */
public class Cuadrilateros extends EjemploClase{
        public int base;
        public int altura;

    public Cuadrilateros(int base, int altura, String nombre, int lado, int cant_lados) {
        super(nombre, lado, cant_lados);
        this.base = base;
        this.altura = altura;
    }
        
        @Override
    public int Area(){
        return base*altura;
    }

        @Override
    public int Volumnen(){
        return  base*altura*lado;
    }
    
        @Override
    public int Perimetro(){
        return 2*base+2*altura;
    }
}
