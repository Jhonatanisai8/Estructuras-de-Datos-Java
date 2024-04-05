package com.mycompany;

public class NodoCircular {

    public int dato;
    NodoCircular siguiente;

    public NodoCircular(int elemento) {
        this.dato = elemento;
        //el puntero apunta a si mismo
        siguiente = this;
    }
}
