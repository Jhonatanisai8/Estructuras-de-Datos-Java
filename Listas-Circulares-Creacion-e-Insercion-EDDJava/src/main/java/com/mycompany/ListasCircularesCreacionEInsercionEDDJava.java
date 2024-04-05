package com.mycompany;

import javax.swing.JOptionPane;

public class ListasCircularesCreacionEInsercionEDDJava {

    public static void main(String[] args) {
        int opcion;
        int elemento;

        //creamos un objeto de la clase lista
        ListaCircular listaCircular = new ListaCircular();
        String mensaje = """
                         1. ¿La Lista esta Vacia?
                         2. Agregar Un Elemento
                         3. Mostrar la Lista
                         4. Salir""";
        do {
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
                    JOptionPane.showMessageDialog(null, "Gracias por tu participacion", "Bay", JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elige una opcion Valida", "ATENCION", JOptionPane.CANCEL_OPTION);
                    break;
            }
        } while (opcion != 4);
    }
}
