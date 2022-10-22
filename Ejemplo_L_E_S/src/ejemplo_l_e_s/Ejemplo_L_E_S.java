/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_l_e_s;
import ejemplo_l_e_s.Lista_Enlazada;
/**
 *
 * @author Usuario
 */
public class Ejemplo_L_E_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista_Enlazada nuevaLista = new Lista_Enlazada();
        nuevaLista.agregar(0, "partor aleman", 3, "Pardo", "Kevin", 15);
        nuevaLista.agregar(1, "Husky", 4, "lobito", "Jose", 68);
        nuevaLista.recorrer();
    }
    
}
