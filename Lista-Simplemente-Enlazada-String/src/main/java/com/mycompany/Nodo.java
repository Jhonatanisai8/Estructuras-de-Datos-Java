package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class Nodo {

    //nuestro dato
    public String dato;
    //puntero
    public Nodo siguiente;

    //constructor para insertar la final de la lista
    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    //constructor para insertar al inicio de la lista
    public Nodo(String dato, Nodo nodito) {
        this.dato = dato;
        siguiente = nodito;
    }

}
