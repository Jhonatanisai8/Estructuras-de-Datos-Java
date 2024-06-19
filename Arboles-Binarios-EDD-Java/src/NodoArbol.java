public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo,hijoDerecho;


    //constructor
    public NodoArbol(int dato,String nom){
        this.dato = dato;
        this.nombre = nom;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    public String toString(){
        return nombre + " Su dato es "+dato;
    }
    
}
