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
        return "Elemento Insertado";
    }

}
