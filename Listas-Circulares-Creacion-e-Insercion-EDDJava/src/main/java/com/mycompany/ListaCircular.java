package com.mycompany;

import java.text.DecimalFormat;
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

    //metodo para conocer el promedio de todos los nodos
    public double promedioNodos() {
        double promedio;
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;

        //recorer la lista
        do {
            contador++;
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);

        promedio = (double) sumaNodos() / contador;
        return promedio;
    }

    //metodo para conocer la suma de los nodos pares
    public int sumaNodosPares() {
        int suma = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if ((aux.dato % 2) == 0) {
                suma += aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return suma;
    }

    public int sumaNodosImpares() {
        int suma = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if ((aux.dato % 2) != 0) {
                suma += aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return suma;
    }

    //metodo para conocer el promedio de nodos pares
    public String promedioNodosPares() {
        double promedio;
        promedio = (double) sumaNodosPares() / contadorNodosPares();
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(promedio);
    }

    //metodo para conocer el promedio de nodos impares
    public String promedioNodosImpares() {
        double promedio;
        promedio = (double) sumaNodosImpares() / contadorNodosImpares();
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(promedio);
    }

    //metodo para el promedio de nodos positivos
    public String promedioNodosPositivos() {
        double promedio;
        promedio = (double) sumaNodosPositivos() / contadorNodosPositivos();
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(promedio);
    }

    public String promedioNodosNegativos() {
        double promedio;
        promedio = sumaNodosNegativos() / contadorNodosNegativos();
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(promedio);
    }

    //metodo para conocer el promedio de los nodos positivos
    public int contadorNodosPositivos() {
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato > 0) {
                contador++;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return contador;
    }

    //metodo para conocer el promedio de los nodos positivos
    public int contadorNodosNegativos() {
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            if (aux.dato < 0) {
                contador++;
            }
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        return contador;
    }

    //contador de nodos pares
    public int contadorNodos() {
        int contador = 0;
        NodoCircular aux;
        aux = ultimo.siguiente;
        do {
            contador++;
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
    public int eliminarNodoAlFinal() {
        int elemento;

        //si hay un solo nodo
        if (this.ultimo.siguiente == this.ultimo) {
            elemento = this.ultimo.dato;
            this.ultimo = null;
            return elemento;
        }

        //hay dos nodos en la lista
        NodoCircular puntero = this.ultimo.siguiente;

        //avanzamos el puntero hasta el segundo nodo desde el final
        while (puntero.siguiente != this.ultimo) {
            puntero = puntero.siguiente;
        }

        //guardamos el elemento
        elemento = this.ultimo.dato;

        //eliminamos
        puntero.siguiente = this.ultimo.siguiente;
        this.ultimo = puntero;
        return elemento;
    }

    public int eliminarNodoAlInicio() {
        int elemento;
        elemento = this.ultimo.siguiente.dato;

        //si hay un solo nodo en la lista
        if (this.ultimo.siguiente == this.ultimo) {
            //elimina si hay un solo nodo 
            this.ultimo = null;
        } else {
            //primer nodo           apunta al segundo nodo de la listas
            this.ultimo.siguiente = this.ultimo.siguiente.siguiente;
        }
        return elemento;
    }

    public String ultimoPrimerNodo() {
        int pri, ul;
        pri = this.ultimo.siguiente.dato;
        ul = ultimo.dato;
        return "Primer Nodo de la Lista: " + pri
                + "\nUltimo Nodo de la Lista: " + ul;
    }

    public boolean buscarNodo(int dato) {
        NodoCircular temporal;
        temporal = this.ultimo.siguiente;
        boolean encontrado = false;
        do {
            if (temporal.dato == dato) {
                encontrado = true;
            }
            temporal = temporal.siguiente;
        } while (temporal != ultimo.siguiente);
        return encontrado;
    }

    //metodo para saber si un numero es primo
    public boolean numeroPrimo(int numeroPrimo) {

        if (numeroPrimo == 0 || numeroPrimo == 1) {
            //  System.out.println("No es primo");
            return false;
        } else {
            int iterador = 2;
            while (iterador <= numeroPrimo / 2) {
                if (numeroPrimo % iterador == 0) {
                    // System.out.println("No es primo");
                    return false;
                }
                iterador++;
            }
            return true;
        }
    }

    //saber cuantos nodos primos hay en la lista
    public int contadorNumerosPrimos() {
        int contador = 0;
        NodoCircular temporal;
        temporal = this.ultimo.siguiente;
        do {
            if (numeroPrimo(temporal.dato) == true) {
                contador++;
            }
            temporal = temporal.siguiente;
        } while (temporal != ultimo.siguiente);

        return contador;
    }

}
