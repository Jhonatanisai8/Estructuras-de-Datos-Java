public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // metodo para insertar un nodo en el arbol
    public void agregarNodo(int dato, String nombre) {
        NodoArbol nuevo = new NodoArbol(dato, nombre);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;

            while (true) {
                padre = auxiliar;
                if (dato < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    // metodo para ver si el arbol esta vacio
    public boolean estaVacia() {
        return raiz == null;
    }

    // metodo para recorrer el arbol
    public void inOrden(NodoArbol r) {
        
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.print(" |" + r.dato + "|,");
            inOrden(r.hijoDerecho);
        }
    }

    // metodo para recorrer el arbol en preOrden
    public void preOrden(NodoArbol r) {
        if (r != null) {
            System.out.print("| " + r.dato + "| ,");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }

    // metodo para recorrer el arbol en postOrden
    public void postOrden(NodoArbol r) {
        if (r != null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print("| " + r.dato + "| ,");
        }
    }

}
