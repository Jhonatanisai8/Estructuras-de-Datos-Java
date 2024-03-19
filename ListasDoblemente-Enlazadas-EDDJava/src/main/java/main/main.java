/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {

        // creamos un objeto de tipo nodo
        ListaDoble lista = new ListaDoble();
        int opcion = 0;
        int elemento;
        String mensaje
                = """
                  1. Agregar un Nodo al Inicio
                  2. Agregar un Nodo al final 
                  3. Mostrar la lista de Inicio a Fin
                  4. Mostrar la lista de Fin a Inicio
                  5. Eliminar un Nodo del Inicio 
                  6. Eliminar un nodo del Final
                  7. Saber si la Lista esta vacia
                  8. Borrar Todos los Nodos
                  9. Salir
                  ¿Que deseas?""";
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(
                                JOptionPane.showInputDialog(null, "Ingresa el Elemento del Nodo: ",
                                        "Agregando Nodo al Inicio", JOptionPane.INFORMATION_MESSAGE));
                        lista.Insertar_al_Inicio(elemento);

                        break;
                    case 2:
                        elemento = Integer.parseInt(
                                JOptionPane.showInputDialog(null, "Ingresa el Elemento del Nodo: ",
                                        "Agregando Nodo Al Final", JOptionPane.INFORMATION_MESSAGE));
                        lista.Insertar_al_Final(elemento);
                        break;
                    case 3:
                        lista.Mostrar_Lista_inicio_fin();
                        break;
                    case 4:
                        lista.Mostrar_Lista_fin_inicio();
                        break;
                    case 5:
                        if (!lista.Esta_Vacia()) {
                            elemento = lista.Eliminar_del_Inicio();
                            JOptionPane.showMessageDialog(null, "Elemento Elimanado es" + "[" + elemento + "]",
                                    "Eliminando del Nodo Inicio",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos Aun", "Lista Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!lista.Esta_Vacia()) {
                            elemento = lista.Eliminar_del_final();
                            JOptionPane.showMessageDialog(null, "Elemento Elimanado es" + "[" + elemento + "]",
                                    "Eliminando Nodo del Final",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos Aun", "Lista Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia", "WARNING", 3);
                        } else {
                            JOptionPane.showMessageDialog(null, "La lista Contiene Datoss", "WARNING", 3);
                        }
                        break;
                    case 8:
                        lista.borrarTodosNodos();
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "FIN", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el Menu", "Incorrecto",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 9);
    }

}
