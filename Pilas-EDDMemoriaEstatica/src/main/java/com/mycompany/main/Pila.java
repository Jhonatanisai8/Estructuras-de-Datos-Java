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
}
