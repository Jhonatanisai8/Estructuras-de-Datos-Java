package com.mycompany;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListasCircularesCreacionEInsercionEDDJava {

    public static void main(String[] args) {
        int opcion = 0;
        int elemento;

        //creamos un objeto de la clase lista
        ListaCircular listaCircular = new ListaCircular();
        String mensaje = """
                         1. ¿La Lista esta Vacia?
                         2. Agregar Un Elemento
                         3. Mostrar la Lista
                         4. ¿Buscar Elemento y Borrar?
                         5. Borrar Nodo del fin
                         6. Borrar Nodo del Inicio
                         7. Nodo Mayor
                         8. Nodo Menor
                         9. Suma de todo los Nodos
                        10. Suma de Nodos Positivos
                        11. Suma de Nodos Negativos
                        12. Multiplicacion de todo los Nodos
                        13. Multiplicacion de Nodos Positivos
                        14. Multiplicacion de Nodos Negativos
                        15. Salir""";
        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "MENU DE OPCIONES", JOptionPane.CLOSED_OPTION));
                switch (opcion) {
                    case 1:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCION", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Lista contiene Datos", "ATENCION", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar", "Insertando el lista circular", JOptionPane.INFORMATION_MESSAGE));
                        listaCircular.insertaNodo(elemento);
                        break;
                    case 3:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia, No hay datos a mostrar", "ATENCION", JOptionPane.WARNING_MESSAGE);
                        } else {
                            String datos = listaCircular.mostrarLista();
                            JOptionPane.showMessageDialog(null, datos, "MOSTRANDO LISTA CIRCULAR", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Ingresa un Nodo a buscar: ?", "Ingresa Ingresa", 2));
                        if (!listaCircular.estaVacia()) {
                            if (listaCircular.eliminarNodo(elemento)) {
                                JOptionPane.showMessageDialog(null, "Elemento: " + elemento + " Borrado", "Borrando Nodo", 2);
                            } else {
                                JOptionPane.showMessageDialog(null, "Elemento " + elemento + " No Encontrado", "ATENCION", 2);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        }
                        break;
                    case 5:
                        if (!listaCircular.estaVacia()) {
                            listaCircular.eliminarNodoAlFinal();
                        } else {
                            JOptionPane.showMessageDialog(null, "La lista circular esta vacia", "ATENCIÓN", 2);
                        }
                        break;
                    case 6:
                        if (listaCircular.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia ");
                        } else {
                            int valorEliminado = listaCircular.eliminarNodoAlInicio();
                            JOptionPane.showMessageDialog(null, "Noto elimado es: " + valorEliminado, "ATENCION", 3);
                        }
                        break;
                    case 7:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int nodo;
                            nodo = listaCircular.nodoMayor();
                            JOptionPane.showMessageDialog(null, "Nodo mayor de la lista: " + nodo, "ATENCIÓN", 3);
                        }
                        break;
                    case 8:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "ATENCIÓN", 3);
                        } else {
                            int nodoMenor;
                            nodoMenor = listaCircular.nodoMenor();
                            JOptionPane.showMessageDialog(null, "Nodo Menor de la lista: " + nodoMenor, "ATENCIÓN", 3);
                        }
                        break;
                    case 9:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int sumaNodos = listaCircular.sumaNodos();
                            JOptionPane.showMessageDialog(null, "Suma de Nodos: " + sumaNodos, "ATENCIÓN", 3);
                        }
                        break;
                    case 10:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int suma;
                            suma = listaCircular.sumaNodosPositivos();
                            JOptionPane.showMessageDialog(null, "Suma de los Nodos Positvos: "
                                    + "\t" + suma, "ATENCIÓM", 2);
                        }
                        break;
                    case 11:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int suma;
                            suma = listaCircular.sumaNodosNegativos();
                            JOptionPane.showMessageDialog(null, "Suma de los Nodos Negativos: "
                                    + "\t" + suma, "ATENCIÓM", 2);
                        }
                        break;
                    case 12:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int multiplicacion;
                            multiplicacion = listaCircular.multiplicacionNodos();
                            JOptionPane.showMessageDialog(null, "Multiplicacion de Todos los Nodos: "
                                    + "\t" + multiplicacion, "ATENCIÓM", 2);
                        }
                        break;
                    case 13:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int multiplicacion;
                            multiplicacion = listaCircular.multiplicacionNodosPositivos();
                            JOptionPane.showMessageDialog(null, "Multiplicacion de Nodos Positovos: "
                                    + "\t" + multiplicacion, "ATENCIÓM", 2);
                        }
                        break;
                    case 14:
                        if (listaCircular.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            int multiplicacion;
                            multiplicacion = listaCircular.multiplicacionNodosNegativos();
                            JOptionPane.showMessageDialog(null, "Multiplicacion de Nodos Negativos: "
                                    + "\t" + multiplicacion, "ATENCIÓM", 2);
                        }
                        break;
                    case 15:
                        JOptionPane.showMessageDialog(null, "Gracias por tu participacion", "Bay", JOptionPane.WARNING_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Elige una opcion Valida", "ATENCION", JOptionPane.CANCEL_OPTION);
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "WARNING", 3);
            }
        } while (opcion != 15);
    }
}
