package main;

import javax.swing.JOptionPane;

public class ListaDoble {

    private NodoDoble inicio;
    private NodoDoble fin;

    // constructor
    public ListaDoble() {
        inicio = fin = null;
    }

    // metodo para saber cuando la lista esta vacia
    public boolean Esta_Vacia() {
        return inicio == null;
    }

    // metodo para agregar nodos al final
    public void Insertar_al_Final(int elemento) {
        if (!Esta_Vacia()) {
            fin = new NodoDoble(elemento, null, fin);
            // apuntamos fin de siguienye de anterior a fin
            fin.anterior.siguiente = fin;
        } else {
            // para cuando no hay nodos
            inicio = fin = new NodoDoble(elemento);
        }
    }

    // metodo para agregar al inicio
    public void Insertar_al_Inicio(int elemento) {
        if (!Esta_Vacia()) {
            inicio = new NodoDoble(elemento, inicio, null);
            // apuntamos inicio de siguienye de anterior a fin
            inicio.siguiente.anterior = inicio;
        } else {
            //para cuando aun no hay nodos
            inicio = fin = new NodoDoble(elemento);
        }
    }

    // metoo para mostar la lista de inicio a fin
    public void Mostrar_Lista_inicio_fin() {
        if (!Esta_Vacia()) {
            String dato = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                dato = dato + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, dato, "Mostrando Lista de Inicio a Fin",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos Aun", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // metodo para mostar la lista de fin a incio
    public void Mostrar_Lista_fin_inicio() {
        if (!Esta_Vacia()) {
            String dato = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                dato = dato + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, dato, "Mostrando Lista de Fin a Inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Nodos Aun", "Lista Vacia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // metodo para eliminar del inicio
    public int Eliminar_del_Inicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    // metodo para eliminar del final
    public int Eliminar_del_final() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }

    //metodo para borrar todos los nodos de la lista 
    public void borrarTodosNodos() {
        if (Esta_Vacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            while (!Esta_Vacia()) {
                this.Eliminar_del_Inicio();
            }
            JOptionPane.showMessageDialog(null, "Todos los nodos de la lista fueron boorrados");
        }
    }

    //metodos para borrar un nodo en especifico
    public boolean deleteSpecificNode(int dato) {
        boolean encontrado = false;

        if (!Esta_Vacia()) {
            if (inicio == fin && dato == inicio.dato) {
                inicio = null;
                fin = null;
                encontrado = true;
            } else if (dato == inicio.dato) {
                inicio = inicio.siguiente;
                inicio.anterior = null;
                encontrado = true;
            } else {
                NodoDoble recorer, temporal;
                recorer = inicio;
                temporal = inicio.siguiente;

                while (recorer != null && temporal.dato != dato) {
                    recorer = recorer.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    recorer.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = recorer;
                    } else {
                        temporal.siguiente.anterior = recorer;
                    }
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    public int sumPositiveNodes() {
        NodoDoble recorrer = inicio;
        int suma = 0;
        while (recorrer != null) {
            if (recorrer.dato > 0) {
                suma += recorrer.dato;
            }
            recorrer = recorrer.siguiente;
        }
        return suma;
    }

    public int sumNegativeNodes() {
        NodoDoble recorrer = inicio;
        int suma = 0;
        while (recorrer != null) {
            if (recorrer.dato < 0) {
                suma += recorrer.dato;
            }
            recorrer = recorrer.siguiente;
        }
        return suma;
    }

    public int multiplicationPositiveNodes() {
        int multiplicaion = 1;

        NodoDoble recore = inicio;
        while (recore != null) {
            if (recore.dato > 0) {
                multiplicaion *= recore.dato;
            }
            recore = recore.siguiente;
        }
        return multiplicaion;
    }

    public int multiplicationNegativeNodes() {
        int multiplicaion = 1;
        NodoDoble recore = inicio;
        while (recore != null) {
            if (recore.dato < 0) {
                multiplicaion *= recore.dato;
            }
            recore = recore.siguiente;
        }
        return multiplicaion;
    }

    public int counterPositiveNodes() {
        int contador = 0;
        NodoDoble recorrer = inicio;
        while (recorrer != null) {
            if (recorrer.dato > 0) {
                contador++;
            }
            recorrer = recorrer.siguiente;
        }
        return contador;
    }

    public int counterNegativeNodes() {
        int contador = 0;
        NodoDoble recorrer = inicio;
        while (recorrer != null) {
            if (recorrer.dato < 0) {
                contador++;
            }
            recorrer = recorrer.siguiente;
        }
        return contador;
    }

    //contador de ceros
    public int counterNodesZeroes() {
        int contador = 0;
        NodoDoble recorer = inicio;
        while (recorer != null) {
            if (recorer.dato == 0) {
                contador++;
            }
            recorer = recorer.siguiente;
        }
        return contador;
    }

    //numero mayor
    public int majornode() {
        NodoDoble recorer = inicio;
        int nodo = inicio.dato;
        while (recorer != null) {
            if (recorer.dato > nodo) {
                nodo = recorer.dato;
            }
            recorer = recorer.siguiente;
        }
        return nodo;
    }

    //nodo menor
    public int minorNode() {
        NodoDoble recorer = inicio;
        int nodo = inicio.dato;
        while (recorer != null) {
            if (recorer.dato < nodo) {
                nodo = recorer.dato;
            }
            recorer = recorer.siguiente;
        }
        return nodo;
    }

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

    //saber cuantos numeros primos hay en la lista 
    public int counterNodesCousins() {
        int contador = 0;
        NodoDoble recorrer = inicio;
        while (recorrer != null) {
            if (this.numeroPrimo(recorrer.dato) == true) {
                contador++;
            }
            recorrer = recorrer.siguiente;
        }
        return contador;
    }

    //buscar Nodos
    public boolean findNode(int dato) {
        NodoDoble temporal = inicio;
        while (temporal != null && temporal.dato != dato) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    //inicio de dato
    public int firstNode() {
        return inicio.dato;

    }

    //ultimo dato
    public int lastNode() {
        return fin.dato;
    }
}
