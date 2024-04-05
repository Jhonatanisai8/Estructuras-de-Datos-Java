package com.mycompany;

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

}
