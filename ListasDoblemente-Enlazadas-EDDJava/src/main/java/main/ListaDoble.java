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
    
}
