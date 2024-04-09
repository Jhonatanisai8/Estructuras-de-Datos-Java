package com.mycompany.main;
//@jhonatan Isai

public class Pila {

    int vectarPila[];
    int cima;

    public Pila(int tamanio) {
        vectarPila = new int[tamanio];
        cima = -1;
    }

    //metodo para agregar un elemento a la pila
    public void empujar(int dato) {
        cima++;
        vectarPila[cima] = dato;
    }

    //metodo para sacar
    public int sacarElemento() {
        int fuera;
        fuera = vectarPila[cima];
        cima--;
        return fuera;
    }

    //metodo para saber si la pila esta vacia
    public boolean estaVacia() {
        return cima == -1;
    }

    //metodo parsa saber si la pila esta llena
    public boolean estaLlena() {
        return vectarPila.length - 1 == cima;
    }

    //metodo para saber que elemento esta en la cima
    public int cimaPila() {
        return vectarPila[cima];
    }

    //metodo para saber el tamanio de la pila
    public int tamanioPila() {
        return vectarPila.length;
    }

}
