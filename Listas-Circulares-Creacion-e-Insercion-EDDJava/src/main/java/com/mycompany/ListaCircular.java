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
}
