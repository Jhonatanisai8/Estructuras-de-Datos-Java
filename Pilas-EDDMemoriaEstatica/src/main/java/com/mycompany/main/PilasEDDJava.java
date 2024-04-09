package com.mycompany.main;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author jHonatan
 */
public class PilasEDDJava {
    
    public static void main(String[] args) {
        ejemplo();
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
                         5. ¿Elemento que esta en la Cima?
                         6. Tamaño de la Pila
                         7. Limpiar Toda la Pila
                         8. Mostrar toda la Pila
                         9. Salir
                         """;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "PILA", 2));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a Insertar: ", "INSERTANDO DATOS", 2));
                        if (pila.estaLlena()) {
                            JOptionPane.showMessageDialog(null, "La pila ya esta llena", "ATENCIÓN", 3);
                        } else {
                            pila.empujar(elemento);
                            
                        }
                        break;
                    case 2:
                        int dato;
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia", "WARNING", 3);
                        } else {
                            dato = pila.sacarElemento();
                            JOptionPane.showMessageDialog(null, "Elemento Sacado: " + dato);
                        }
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
                    case 5:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia", "WARNING", 3);
                        } else {
                            int ultimo = pila.cimaPila();
                            JOptionPane.showMessageDialog(null, "Elemento que esta el la cima es: " + ultimo, "ATENCION", 2);
                        }
                        break;
                    case 6:
                        
                        int tamanio = pila.tamanioPila();
                        JOptionPane.showMessageDialog(null, "Tamaño de la Pila es:  " + tamanio, "ATENCION", 2);
                        
                        break;
                    case 7:
                        if (pila.limpiarPila()) {
                            JOptionPane.showMessageDialog(null, "Pila Limpiada", "ATENCIÓN", 2);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia", "ATENCIÓN", 3);
                        }
                        break;
                    case 8:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta Vacia", "WARNING", 3);
                        } else {
                            JOptionPane.showMessageDialog(null, pila.mostrarPila(), "MOSTRANDO DATOS", 3);
                        }
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Gracias por participar", "ATENCIÓN", 2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Eliga una opcion Correcta", "ATENCIÓN", 3);
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: " + e.toString(), "WARNING", 2);
            }
            
        } while (opcion != 9);
    }
    
}
