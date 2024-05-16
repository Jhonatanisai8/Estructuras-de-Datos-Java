package main;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListasSimplementeEnlazadasEDDJava {

    public static void main(String[] args) {

        Lista listasimple = new Lista();
        int elemento;
        int opcion = 0;
        String mensaje = """
                         1. Insertar Al inicio
                         2. Agregar Al final
                         3. Mostrar Lista
                         4. Borrar Nodo del Inicio
                         5. Borar Nodo del final
                         6.¿La lista esta vacia?
                         7. Eliminar Un Nodo en Especifico
                         8. Buscar Nodo
                         9. Limpiar Toda la lista
                        10. Ordenar Lista
                        11. Sumatoria de los Nodos de la Lista
                        12. Sumataria de Nodos Impares
                        13. Sumatoria de Nodos Pares
                        14. Conocer el Promedio de los Numeros Pares
                        15. Conocer el promedio de los numeros Impares
                        16. Conocer el Total de Nodos
                        17. Conocer el Promedio total de la Lista
                        18. Total de Nodos Negativos Sin incluir al "0"
                        19. Total de Nodos Positivos Sin incluir al "0"
                        20. Total de Ceros Ingresados
                        21. Inicio y Inicio de Siguiente
                        22. Numero Mayor de la Lista
                        23. Numero Menor de la Lista
                        24. Conocer el Primer Nodo de la Lista
                        25. Conocer el ultimo Nodo de la lista
                        26. Salir""";
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar", "Insertando al Inicio", 1));
                        listasimple.agregarInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar", "Insertando al Final", 1));
                        listasimple.agregarFin(elemento);
                        break;
                    case 3:
                        listasimple.mostrarLista();
                        break;
                    case 4:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            int elementoBorrado = listasimple.borrarInicio();
                            JOptionPane.showMessageDialog(null, "Elemento Borrado del Inicio es => " + elementoBorrado);
                        }
                        break;
                    case 5:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            int elementoEliminado = listasimple.borrarFin();
                            JOptionPane.showMessageDialog(null, "Elemento Borrado del Final es => " + elementoEliminado);
                        }
                        break;
                    case 6:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "Lista vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista con datos");
                        }
                        break;
                    case 7:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Nodo a Eliminar"));
                            if (listasimple.eliminarNodoEspecifico(dato) == true) {
                                JOptionPane.showMessageDialog(null, "Elemento Eliminado => " + dato);
                            } else {
                                JOptionPane.showMessageDialog(null, "Elemento no encontrado");
                            }
                        }
                        break;
                    case 8:
                        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nodo a buscar => "));
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            if (listasimple.bucarNodo(dato) == true) {
                                JOptionPane.showMessageDialog(null, "Elemento " + dato + "Encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "Elemento " + dato + " no Encontrado");
                            }
                        }
                        break;
                    case 9:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            listasimple.borrarLista(listasimple);
                        }

                        break;
                    case 10:
                        listasimple.ordenarLista();
                        break;
                    case 11:
                        if (listasimple.estaVacia() == true) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int suma = listasimple.sumarNumeros();
                            JOptionPane.showMessageDialog(null, "La suma de los numeros que contiene la lista es de => " + suma);
                        }
                        break;

                    case 12:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");

                        } else {
                            int sumaImpar = listasimple.getsumaImpares();
                            JOptionPane.showMessageDialog(null, "Sumatoria de Numeros Impares es de => " + sumaImpar, "Warning", 3);

                        }
                        break;
                    case 13:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int sumaPar = listasimple.getSumaPares();
                            JOptionPane.showMessageDialog(null, "La suma de los numeros Pares es de => " + sumaPar);
                        }
                        break;
                    case 14:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int sumaPar = listasimple.getPromedioPares();
                            JOptionPane.showMessageDialog(null, "Promedio de los numeros Pares es de => " + sumaPar);
                        }
                        break;
                    case 15:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int sumaPar = listasimple.getPromedioImpares();
                            JOptionPane.showMessageDialog(null, "Promedio  de los numeros Impares es de => " + sumaPar);
                        }
                        break;
                    case 16:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int totaNodos = listasimple.totalNodos();
                            JOptionPane.showMessageDialog(null, "Total de Nodos => " + totaNodos);
                        }
                        break;
                    case 17:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");

                        } else {
                            float promedio = listasimple.getPromedioTotal();
                            JOptionPane.showMessageDialog(null, "Promedi total de los Nodos de la Lista es => " + promedio);
                        }
                        break;
                    case 18:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int totalNegativos = listasimple.nodosNegativos();
                            JOptionPane.showMessageDialog(null, "Total de Numeros Negativos es => " + totalNegativos);
                        }
                        break;
                    case 19:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int totalPositivos = listasimple.nodosPositivos();
                            JOptionPane.showMessageDialog(null, "Total de Numeros Positivos  es => " + totalPositivos);
                        }
                        break;
                    case 20:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int totalCeros = listasimple.totalCeros();
                            JOptionPane.showMessageDialog(null, "Total de Numeros iguales a 0  es => " + totalCeros);
                        }
                        break;
                    case 21:
                        listasimple.inicioSiguiente();
                        break;
                    case 22:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int numMayor = listasimple.nodoMayor();
                            JOptionPane.showMessageDialog(null, "Numero Mayor de la lista => " + numMayor);
                        }
                        break;
                    case 23:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int numMenor = listasimple.nodoMenor();
                            JOptionPane.showMessageDialog(null, "Numero Menor de la lista => " + numMenor);
                        }
                        break;
                    case 24:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int primerNodo = listasimple.primerNodo();
                            JOptionPane.showMessageDialog(null, "El primer Nodo de la Lista es => " + primerNodo);
                        }
                        break;
                    case 25:
                        if (listasimple.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            int ultimoDato = listasimple.ultimoNodo();
                            JOptionPane.showMessageDialog(null, "El ultimo nodo de la lista es => " + ultimoDato);
                        }
                        // listasimple.Saber_Primer_Ultimo_Elemento();
                        break;
                    case 26:
                        JOptionPane.showMessageDialog(null, "Gracias por participar");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Eliga una opcion Correcta");
                        break;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Warning : " + e.toString());
            }
        } while (opcion != 26);
    }
}
