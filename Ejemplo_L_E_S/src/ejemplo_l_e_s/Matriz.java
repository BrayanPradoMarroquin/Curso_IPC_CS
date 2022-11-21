/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_l_e_s;
import ejemplo_l_e_s.Lista_Enlazada;
/**
 *
 * @author Usuario
 */
public class Matriz {
    public Lista_Enlazada Regiones[][];

    public Matriz() {
        this.Regiones = new Lista_Enlazada[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.Regiones[i][j] = new Lista_Enlazada();
            }
        }
        System.out.println("Creadas");
    }
}
