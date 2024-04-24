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
        String mensaje = """
                         1.Añadir un elemento
                         2.Sacar un elemento
                         3.¿La lista esta vacia?
                         4.¿lista esta llena?
                         5.Saber el elemento que esta en la cima
                         6.Saber el tamanio de la pila?
                         7.Limpiar Toda la Pila
                         8.Mostrar la Pila
                         9.Buscar un elemento en la Pila
                         10.SALIR""";
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
                case 9:
                    if (!pila.estaVacia()) {
                        ele = JOptionPane.showInputDialog(null, "Ingresa el elemento a buscar", "BUSCAR ELEMENTO", 2);
                        if (pila.buscarElemento(ele)) {
                            JOptionPane.showMessageDialog(null, "Elemento encontrado", "ATENCION", 2);
                        } else {
                            JOptionPane.showMessageDialog(null, "Elemento no encontrado", "ATENCION", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacia, lo siento", "WARNING", 3);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresa una opcion correcta", "ATENCION", 2);
                    break;
            }
        } while (opcion != 10);
    }

}
