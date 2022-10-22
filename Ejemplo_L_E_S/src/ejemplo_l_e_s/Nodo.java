/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_l_e_s;

/**
 *
 * @author Usuario
 */
//Lista de perros
public class Nodo {
    private int indice;
    private String raza;
    private int edad;
    private String nombre;
    private String dueño;
    private int peso;
    //Puntero a siguiente
    public Nodo siguiente;

    public Nodo(int indice, String raza, int edad, String nombre, String dueño, int peso) {
        this.indice = indice;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.dueño = dueño;
        this.peso = peso;
    }
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }    
    
}
