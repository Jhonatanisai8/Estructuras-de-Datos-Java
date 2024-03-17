package main;

public class Nodo {

    //nuestro dato 
    public int dato;
    public Nodo siguiente; //puntero enlace

    //constructor para insertar al final de la lista
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    //constructor para insertar al inicio de la lista
    public Nodo(int dato, Nodo nodito) {
        this.dato = dato;
        siguiente = nodito;
    }
    
    
    

}
