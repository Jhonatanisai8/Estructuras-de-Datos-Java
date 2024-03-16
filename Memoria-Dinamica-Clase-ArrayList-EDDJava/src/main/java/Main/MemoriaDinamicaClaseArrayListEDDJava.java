package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class MemoriaDinamicaClaseArrayListEDDJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> cadenas;
        cadenas = new ArrayList<>();

        int opcion = 0;
        String mensaje = """
                         1. Agregar una frase 
                         2. Mostrar Arreglo
                         3. Modificar un Arreglo
                         4. Limpiar Arraylist
                         5. Eliminar Un Elemento
                         6. Invertir el Arraylist
                         7. Encontrar un Elemento
                         8. Salir""";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opcion) {
                case 1:
                    llenarAraylist(cadenas);
                    break;
                case 2:
                    mostrardoArraylist(cadenas);
                    break;
                case 3:
                    modificarContenido(cadenas);
                    break;
                case 4:
                    limpiarArraylist(cadenas);
                    break;
                case 5:
                    eliminarElemento(cadenas);
                    break;
                case 6:
                    List<String> reverse = invertirArraylist(cadenas);
                    JOptionPane.showMessageDialog(null, reverse);

                    break;
                case 7:
                    encontrarRegistro(cadenas);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Gracias por participar");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor eliga una opcion Correcta");
                    break;
            }
        } while (opcion != 8);

    }

    /*
    metodos del arraylist 
    add agrega
    get indice
    set esignar
    remove eleimina
    sise para saber su tamaño
     */
    public static void llenarAraylist(ArrayList<String> cadenas) {
        String frase, respuesta;
        do {
            frase = JOptionPane.showInputDialog("Ingresa alguna Frase:");
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog("¿Quiere seguri agregando Cadenas?");

        } while (respuesta.equalsIgnoreCase("Si"));
    }

    public static void mostrardoArraylist(ArrayList<String> cadenas) {
        int total = cadenas.size();
        String mensaje = "";
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist VaciO ");
        } else {
            for (int i = 0; i < total; i++) {
                mensaje += "\t(" + i + ") [" + cadenas.get(i) + "]\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Motrando Contenido de ArrayList Cadena", 1);
        }
    }

    public static void modificarContenido(ArrayList<String> cadenas) {
        int indice;
        String cadena;
        int longitud = cadenas.size();
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist Vacio");
        } else {
            indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrsea el Indice a Modificar => "));
            if (indice < -1 || indice > longitud) {
                JOptionPane.showMessageDialog(null, "Indice fuera de Rango");
            } else {
                cadena = JOptionPane.showInputDialog("Ingresa la nueva Frase");
                cadenas.set(indice, cadena);
                JOptionPane.showMessageDialog(null, "Modificacion realizada con exito");
            }
        }

    }

    public static void limpiarArraylist(ArrayList<String> cadenas) {
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist Vacio");
        } else {
            cadenas.clear();
            JOptionPane.showMessageDialog(null, "Arraylist Limpiado");
        }
    }

    public static void eliminarElemento(ArrayList<String> cadenas) {
        int indide;
        int tamanio = cadenas.size();
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist Vacio");
        } else {
            indide = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el indice a Eliminar"));
            if (indide < -1 || indide > tamanio) {
                JOptionPane.showMessageDialog(null, "Indice fuera de Rango");
            } else {
                cadenas.remove(indide);
                JOptionPane.showMessageDialog(null, "Elemento del Indice : " + indide + " Eliminado Correctamente");
            }
        }
    }

    public static <String> List<String> invertirArraylist(ArrayList<String> cadenas) {
        List<String> reverse = new ArrayList<>(cadenas);
        Collections.reverse(reverse);
        return reverse;
    }

    /*
       String mensaje = "";
        int total = cadenas.size();
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist Vacio");
        } else {
            cadenas.reversed();
            JOptionPane.showMessageDialog(null, "Arraylist Invertido");
            for (int i = total; i >  0; i--) {
                mensaje += "\t(" + i + ") [" + cadenas.get(i) + "]\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Motrando Contenido de ArrayList Cadena", 1);

        }
     */
    public static void encontrarRegistro(ArrayList<String> cadenas) {
        String elementoBuscar;
        if (cadenas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Arraylist Vacio");
        } else {
            elementoBuscar = JOptionPane.showInputDialog("Escribe un elemento: ");
            boolean encontrado = cadenas.contains(elementoBuscar);
            int posicion = cadenas.indexOf(elementoBuscar);
            if (encontrado == true) {
                JOptionPane.showMessageDialog(null, "Elemento Encontrado en el Indice => " + posicion);
            } else {
                JOptionPane.showMessageDialog(null, "Elemento no encontrado");
            }
        }
    }
}
