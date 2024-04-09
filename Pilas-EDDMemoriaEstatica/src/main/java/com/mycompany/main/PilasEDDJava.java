package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author jHonatan
 */
public class PilasEDDJava {

    public static void main(String[] args) {

    }

    public static void ejemplo() {

        int opcion = 0, elemento, tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamanio de la Pila: ", "CREANDO LA PILA", 2));
        Pila pila = new Pila(tam);
        String mensaje = """
                         1. Agregar un elemento a la Pila
                         """;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "PILA", 2));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a Insertar: ", "INSERTANDO DATOS", 2));
                        pila.empujar(elemento);
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: " + e.toString(), "WARNING", 2);
            }

        } while (opcion != 3);
    }

}
