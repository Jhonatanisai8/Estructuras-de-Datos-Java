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
                  9. Borrar Nodo espefico
                 10. Suma de Nodos Positivos
                 11. Suma de Nodos Negativos
                 12. Multiplicacion de Nodos positivos
                 13. Multiplicacion de Nodos negativos
                 14. ¿Saber cuantos Nodos Positivos hay?
                 15. ¿Saber cuantos Nodos negativos hay?
                 16. ¿Saber cual es mayor Nodo?
                 17. ¿Saber cual es menor Nodo?
                 18. ¿Saber cuantos Nodos primos hay en la lista? 
                 19. Encontrar un Nodo en Especifico
                 20. Primer Nodo
                 21. Ultimo Nodo
                 22. Salir
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
//                        if (lista.numeroPrimo(elemento) == true) {
//                            JOptionPane.showMessageDialog(null, "Numero primo");
//                        } else {
//                            JOptionPane.showMessageDialog(null, "Numero no es primo");
//                        }
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
                        if (lista.Esta_Vacia() == true) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
                        } else {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el elemento a buscar: "));
                            if (lista.deleteSpecificNode(elemento)) {
                                JOptionPane.showMessageDialog(null, "Nodo eliminado => " + elemento);
                            } else {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                            }
                        }
                        break;
                    case 10:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "Lista vacia");
                        } else {
                            int suma = lista.sumPositiveNodes();
                            JOptionPane.showMessageDialog(null, "Suma de Nodos positivos es => " + suma);
                        }
                        break;

                    case 11:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "Lista vacia");
                        } else {
                            int suma = lista.sumNegativeNodes();
                            JOptionPane.showMessageDialog(null, "Suma de Nodos positivos es => " + suma);
                        }
                        break;
                    case 12:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int multiplicaion = lista.multiplicationPositiveNodes();
                            JOptionPane.showMessageDialog(null, "Multiplicacion total es => " + multiplicaion, "Multiplicaion de nodos positivos", 2);
                        }
                        break;
                    case 13:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int multiplicaion = lista.multiplicationNegativeNodes();
                            JOptionPane.showMessageDialog(null, "Multiplicacion total es => " + multiplicaion, "Multiplicaion de nodos Negativos", 2);
                        }
                        break;
                    case 14:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "Lista vacia");
                        } else {
                            int contador = lista.counterPositiveNodes();
                            JOptionPane.showMessageDialog(null, "Total de Nodos Positivos => " + contador);
                        }
                        break;
                    case 15:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
                        } else {
                            int contador = lista.counterNegativeNodes();
                            JOptionPane.showMessageDialog(null, "Total de nodos negativos es => " + contador);
                        }
                        break;
                    case 16:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
                        } else {
                            int numero = lista.majornode();
                            JOptionPane.showMessageDialog(null, "El nodo mayor es => " + numero);
                        }
                        break;
                    case 17:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
                        } else {
                            int numero = lista.minorNode();
                            JOptionPane.showMessageDialog(null, "El nodo menonr es => " + numero);
                        }
                        break;
                    case 18:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta Vacia");
                        } else {
                            int contador = lista.counterNodesCousins();
                            JOptionPane.showMessageDialog(null, "Total de Nodos Primos => " + contador);
                        }
                        break;
                    case 19:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Nodo a Buscar"));
                            if (lista.findNode(elemento)) {
                                JOptionPane.showMessageDialog(null, "Nodo encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                            }
                        }
                        break;
                    case 20:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            int primer = lista.firstNode();
                            JOptionPane.showMessageDialog(null, "El primer Nodo de la lista es => " + primer);
                        }
                        break;
                    case 21:
                        if (lista.Esta_Vacia()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            int ultimo = lista.lastNode();
                            JOptionPane.showMessageDialog(null, "El ultimo Nodo de la lista es => " + ultimo);
                        }
                        break;
                    case 22:
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
        } while (opcion != 22);
    }

}
