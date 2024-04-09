package com.mycompany.main;

import java.awt.HeadlessException;
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
                         2. Sacar un Elemento de la Pila
                         3. Saber si la Pila esta Vacia
                         4. Saber si la pila esta llena
                         5. Salir
                         """;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "PILA", 2));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a Insertar: ", "INSERTANDO DATOS", 2));
                        pila.empujar(elemento);
                        break;
                    case 2:
                        int dato;
                        dato = pila.sacarElemento();
                        JOptionPane.showMessageDialog(null, "Elemento sacado es: " + dato);
                        break;
                    case 3:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia", "WARNING", 3);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta Vacia", "WARNING", 3);
                        }
                        break;
                    case 4:
                        if (pila.estaLlena()) {
                            JOptionPane.showMessageDialog(null, "La pila esta llena", "ATENCION", 3);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta llena", "ATENCION", 3);
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: " + e.toString(), "WARNING", 2);
            }

        } while (opcion != 5);
    }

}
