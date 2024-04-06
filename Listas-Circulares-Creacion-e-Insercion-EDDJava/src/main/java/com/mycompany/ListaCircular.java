package com.mycompany;

import javax.swing.JOptionPane;

public class ListaCircular {

    NodoCircular ultimo;

    //se incializa en null
    public ListaCircular() {
        ultimo = null;
    }

    //metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //metodo para insertar nodos
    public ListaCircular insertaNodo(int dato) {
        //creamos un nuevo nodo
        NodoCircular nuevo = new NodoCircular(dato);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //metodo para recorerr  o mostrar la lista
    public String mostrarLista() {
        String mensaje = "";
        NodoCircular aux = ultimo.siguiente;

        //recorer la lista
        do {
            mensaje += "[" + aux.dato + "]==>";
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);

        return mensaje;
    }

    //metodo para eliminar nodo
    public boolean eliminarNodo(int elemento) {
        //creamos un nodo auxiliar
        NodoCircular nodoActual;
        boolean encontrado = false;
        nodoActual = ultimo;
        //no se ah encontrado
        while (nodoActual.siguiente != ultimo && !encontrado) {
            //si ya lo encontro igualamos
            encontrado = (nodoActual.siguiente.dato == elemento);
            if (!encontrado) { // si no esta encontrado
                nodoActual = nodoActual.siguiente;
            }
        }

        encontrado = (nodoActual.siguiente.dato == elemento);
        if (encontrado) {
            NodoCircular auxiliar = nodoActual.siguiente;
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            } else {
                if (auxiliar == ultimo) {
                    ultimo = nodoActual;
                }
                nodoActual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return encontrado == true;
    }

    //metodo para borar nodos
    public void eliminarNodoAlFinal() {

        NodoCircular actual = this.ultimo;
        NodoCircular anterior = null;

        // Recorrer la lista hasta encontrar el nodo anterior al último
        while (actual.siguiente != this.ultimo) {
            anterior = actual;
            actual = actual.siguiente;
        }

        // Si la lista solo tiene un nodo
        if (anterior == null) {
            this.ultimo = null;
        } else {
            anterior.siguiente = this.ultimo;
        }

        // Eliminar el último nodo de la memoria
        actual = null;
        JOptionPane.showMessageDialog(null, "Nodo eliminado: " + actual, "ATENCION", 3);
    }

    public int eliminarNodoAlInicio() {

        int valorEliminado = this.ultimo.dato;
        NodoCircular actual = this.ultimo;
        NodoCircular anterior = null;

        // Recorrer la lista hasta encontrar el nodo anterior al primero
        while (actual.siguiente != this.ultimo) {
            anterior = actual;
            actual = actual.siguiente;
        }

        // Si la lista solo tiene un nodo
        if (anterior == null) {
            this.ultimo = null;
        } else {
            anterior.siguiente = this.ultimo;
        }

        // Eliminar el primer nodo de la memoria
        actual = null;
        
        return valorEliminado;
    }

}
