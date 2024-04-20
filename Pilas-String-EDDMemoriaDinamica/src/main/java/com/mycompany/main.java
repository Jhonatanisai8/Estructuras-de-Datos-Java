package com.mycompany;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ejemploPila();
    }

    public static void ejemploPila() {
        int tam, opcion;
        String ele;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamanio de la pila: ", "BIENVENIDO", 2));
        Pila pila = new Pila(tam);
        String mensaje = "1.Añadir un elemento"
                + "\n2.Sacar un elemento"
                + "\n3.¿La lista esta vacia?"
                + "\n4.¿La lista esta llena?"
                + "\n5.Saber el elemento que esta en la cima"
                + "\n6.¿Saber el tamanio de la pila?"
                + "\n7.Limpiar Toda la Pila"
                + "\n8.Mostrar la Pila"
                + "\n9.SALIR";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "MENU DE OPCIONEZ", 2));
            switch (opcion) {
                case 1:
                    ele = JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar", "INSERTANDO A LA PILA", 3);
                    if (!pila.estaLlena()) {
                        pila.empujar(ele);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila llena, lo siento", "WARNING", 3);
                    }
                    break;
                case 2:
                    if (!pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "Elemento sacado: " + pila.sacarElemento(), "SACANDO ELEMENTO", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    }
                    break;
                case 3:
                    if (pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila no Vacia", "WARNING", 3);
                    }
                    break;
                case 4:
                    if (pila.estaLlena()) {
                        JOptionPane.showMessageDialog(null, "Pila Llena, lo siento", "WARNIING", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila aun con capacidad para elementos", "WARNIING", 3);
                    }
                    break;
                case 5:
                    if (pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Elemento de la cima: " + pila.cimaPila(), "MOSTRANDO DATOS", 3);
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + pila.tamanioPila(), "MOSTRANDO INFORMACION", 2);
                    break;
                case 7:
                    if (!pila.estaVacia()) {
                        int op;
                        op = JOptionPane.showConfirmDialog(null, "¿QUIERES BORRAR TODOS LOS DATOS DE LA PILA?");
                        if (op == 0) {
                            JOptionPane.showMessageDialog(null, "Pila Limpiada", "ATENCION", 3);
                            pila.limpiarPila();
                        } else {
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    }
                    break;
                case 8:
                    if (pila.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, pila.mostrarPila(), "ELEMENTOS DE LA PILA", 2);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresa una opcion correcta", "ATENCION", 2);
                    break;
            }
        } while (opcion != 9);
    }

}
