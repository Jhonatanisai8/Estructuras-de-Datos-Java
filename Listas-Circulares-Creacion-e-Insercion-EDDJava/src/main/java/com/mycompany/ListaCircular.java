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

    //metodo para encontrar el mayor
    public int nodoMayor() {
        NodoCircular recorrer;
        recorrer = ultimo.siguiente;
        int nodoMayor = ultimo.dato;

        do {
            if (recorrer.dato > nodoMayor) {
                nodoMayor = recorrer.dato;
            }
            recorrer = recorrer.siguiente;
        } while (recorrer != ultimo.siguiente);
        return nodoMayor;
    }

    //metodo para encontrar el nodo menor
    public int nodoMenor() {
        NodoCircular recorrer;
        recorrer = ultimo.siguiente;
        int nodoMenor = ultimo.dato;

        do {
            if (recorrer.dato < nodoMenor) {
                nodoMenor = recorrer.dato;
            }
            recorrer = recorrer.siguiente;
        } while (recorrer != ultimo.siguiente);
        return nodoMenor;
    }

    //metodo para la la suma de los nodos
    public int sumaNodos() {
        int suma = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;

        do {
            suma += aux.dato;
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return suma;
    }

    //suma de nodos positivos
    public int sumaNodosPositivos() {
        int suma = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato > 0) {
                suma += aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return suma;
    }

    //suma de nodos negativos
    public int sumaNodosNegativos() {
        int suma = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato < 0) {
                suma += aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return suma;
    }

    //metodo para conocer la multiplicacio de todos los nodos
    public int multiplicacionNodos() {
        int multiplicacion = 1;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            multiplicacion *= aux.dato;
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return multiplicacion;
    }

    //multiplicacaion de nodos positivos
    public int multiplicacionNodosPositivos() {
        int multiplicacion = 1;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato > 0) {
                multiplicacion *= aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return multiplicacion;
    }

    //metodo para sumar los nodos negativos
    public int multiplicacionNodosNegativos() {
        int multiplicacion = 1;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato < 0) {
                multiplicacion *= aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return multiplicacion;
    }

    //metodo para conocer cuantos numeros pares tengo
    public int contadorNodosPares() {
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;

        do {
            if (aux.dato % 2 == 0) {
                contador++;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return contador;
    }

    //metodo para saber cuantos numeros impares tengo
    public int contadorNodosImpares() {
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if ((aux.dato % 2) != 0) {
                contador++;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return contador;
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
