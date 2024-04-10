package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class ListaSimple {

    protected Nodo inicio, fin;

    //constructor
    public ListaSimple() {
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar al inicio 
    public String agregarInicio(String elemento) {
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
        return "Elemento Insertado al Inicio";
    }

    //metodo para agregar al final
    public String agregarFinal(String dato) {
        if (!estaVacia()) {
            //creamos el nodo 
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
        return "Elemento insertado al Final";
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //metodo para mostrar la lista
    public String mostrarLista() {
        String mensaje = "";
        if (estaVacia()) {
            mensaje = "La lista esta Vacia";
        } else {
            Nodo recorrer;
            recorrer = inicio;
            while (recorrer != null) {
                mensaje += "|" + recorrer.dato + "|-->";
                recorrer = recorrer.siguiente;
            }
        }
        return mensaje;
    }

    //metodo para borrar nodo del inicio
    public String borrarInicio() {
        String el;
        el = inicio.dato;
        //cuando hay un solo nodo
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            //cuando hay mas de dos nodos
            inicio = inicio.siguiente;
        }
        return el;
    }

    //metodo para borrar del final
    public String borrarFinal() {
        String el;
        el = fin.dato;
        //cuando hay un solo nodo
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            //cuando hay mas de dos nodos
            Nodo temporal;
            temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return el;
    }

    //metodo `para buscar un nodo y eliminarlo
    public boolean eliminarNodoEspecifico(String dato) {
        boolean encontrado = false;
        if (!estaVacia()) {
            //cuando hay un solo nodo
            if (inicio == fin && dato.equals(inicio.dato)) {
                inicio = null;
                fin = null;
                encontrado = true;
            } else if (dato.equals(inicio.dato)) { // minimo tenemos dos nodos
                inicio = inicio.siguiente;
                encontrado = true;
            } else {
                //tenemos mas de dos nodos
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;

                while (temporal != null && !temporal.dato.equals(dato)) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }

                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }
}
