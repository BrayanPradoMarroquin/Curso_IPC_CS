/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_l_e_s;
import ejemplo_l_e_s.Nodo;
/**
 *
 * @author Usuario
 */
public class Lista_Enlazada {
    public Nodo cabeza;

    public Lista_Enlazada() {
        this.cabeza = null;
    }
    
    public boolean vacio(){
        if (this.cabeza==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //C -> 51 -> 56 -> 70
    public void agregar(int id, String raza, int edad, String nombre, String duenio, int peso){
        Nodo nuevo = new Nodo(id, raza, edad, nombre, duenio, peso);
        if (this.vacio()) {
            this.cabeza = nuevo;
        }else{
            Nodo aux = this.cabeza;
            while (true) {                
                if (aux.siguiente==null) {
                    aux.siguiente = nuevo;
                    break;
                }else{
                    aux = aux.siguiente;
                }
            }
        }
    }
    
    public void recorrer(){
        Nodo aux = this.cabeza;
        while (aux!=null) {            
            System.out.println("El perro se llama "+aux.getNombre()+" ,tiene "+aux.getEdad()+"Kg");
            aux = aux.siguiente;
        }
    }
}
