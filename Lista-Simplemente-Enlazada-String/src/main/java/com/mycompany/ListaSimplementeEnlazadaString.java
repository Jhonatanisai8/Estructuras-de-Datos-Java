package com.mycompany;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author JHONATAN ISAI
 */
public class ListaSimplementeEnlazadaString {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        ejemplo();
    }

    public static void ejemplo() {
        ListaSimple lista = new ListaSimple();
        int opcion = 0;
        String dato;
        String mensaje = """
                         1. AGREGAR AL INICIO
                         2. AGREGAR AL FINAL
                         3. SABER SI LA LISTA ESTA VACIA
                         4. MOSTRAR LA LISTA
                         5. BORRAR DEL INICIO
                         6. BORRAR DEL FINAL
                         7. ELIMINAR NODO ESPECIFICO
                         8. BUSCAR UN NODO
                         9. LIMPIAR TODA LA LISTA
                        10. SABER EL PRIMERO Y EL ULTIMO
                        11. SALIR
                         """;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "MENÚ DE OPCIONES", 2));
                switch (opcion) {
                    case 1:
                        dato = JOptionPane.showInputDialog(null, "Ingresa un Nodo: ", "INSERTANDO AL INICIO", 2);
                        JOptionPane.showMessageDialog(null, lista.agregarInicio(dato), "ATENCIÓN", 2);
                        break;
                    case 2:
                        dato = JOptionPane.showInputDialog(null, "Ingresa un Nodo: ", "INSERTANDO AL FINAL", 2);
                        JOptionPane.showMessageDialog(null, lista.agregarFinal(dato), "ATENCIÓN", 2);
                        break;
                    case 3:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "LA LISTA ESTA VACIA", "ATENCIÓN", 2);
                        } else {
                            JOptionPane.showMessageDialog(null, "LA LISTA NO ESTA VACIA", "ATENCIÓN", 2);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, lista.mostrarLista(), "MOSTRANDO LISTA", 2);
                        break;
                    case 5://String mensaje = (edad >= 18) ? “Eres mayor de edad” : “Eres menor de edad”;
                        String men = (lista.estaVacia()) ? "Lista Vacia " : "Elemento eliminado es: " + lista.borrarInicio();
                        JOptionPane.showMessageDialog(null, men, "ATENCION", 2);
                        break;
                    case 6:
                        String men2 = (lista.estaVacia()) ? "Lista Vacia " : "Elemento eliminado es: " + lista.borrarFinal();
                        JOptionPane.showMessageDialog(null, men2, "ATENCION", 2);
                        break;
                    case 7:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            dato = JOptionPane.showInputDialog(null, "Ingresa el Nodo a Eliminar: ", "ATENCIÓN", 2);
                            if (lista.eliminarNodoEspecifico(dato)) {
                                JOptionPane.showMessageDialog(null, "El nodo eliminado es: " + dato, "ATENCIÓN", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "El nodo " + dato + " no encontrado", " ATENCIÓN", 3);
                            }
                        }
                        break;
                    case 8:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            dato = JOptionPane.showInputDialog(null, "Ingresa el Nodo a Buscar: ", "ATENCIÓN", 2);
                            if (lista.buscarNodo(dato)) {
                                JOptionPane.showMessageDialog(null, "El nodo " + dato + " encontrado", "ATENCIÓN", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "El nodo " + dato + " no encontrado", " ATENCIÓN", 3);
                            }
                        }
                        break;
                    case 9:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            if (lista.borrarLista(lista)) {
                                JOptionPane.showMessageDialog(null, "Nodos de la lista eliminados", "ATENCIÓN", 2);
                            }
                        }
                        break;
                    case 10:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "ATENCIÓN", 3);
                        } else {
                            JOptionPane.showMessageDialog(null, lista.ultimoPrimero(), "ATENCION", 3);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Elliga una opcion correcta", "ATENCIÓN", 3);
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "ALERTA", 3);
            }
        } while (opcion != 11);
    }
}
