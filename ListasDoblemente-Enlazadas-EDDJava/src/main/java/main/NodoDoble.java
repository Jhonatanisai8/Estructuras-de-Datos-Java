/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author User
 */
public class NodoDoble {

    // creamos nuestro nodo
    public int dato;
    //dos punteros
    NodoDoble siguiente;
    NodoDoble anterior;

    // constructor cuando no hay nodos
    public NodoDoble(int dato) {
        this(dato, null, null);
        //siguiente y anterior apuntan a null
    }

    // construtor cuando ya hay nodos
    public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}
