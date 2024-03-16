package Main;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArregloPalabras {

    public static void main(String[] args) {
        llenarArreglo();
        int arregloNumeros[] = new int[5];
        int arregloCopia[] = new int[5];
        arregloNumeros(arregloNumeros);
        copiarArreglo(arregloNumeros, arregloCopia);
    }

    public static void llenarArreglo() {
        String arregloPalabras[] = new String[10];
        Arrays.fill(arregloPalabras, "Hola Programador");
        int total = arregloPalabras.length;
        String mensaje = "";
        for (int i = 0; i < total; i++) {
            mensaje += "[" + arregloPalabras[i] + "]\n";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Elementos del Arreglo", 1);

    }

    public static void arregloNumeros(int arreglo[]) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i)
                    + " Ingresa un numero => "));
        }
    }

    public static void copiarArreglo(int arreglo1[], int arreglo2[]) {
        int total = arreglo1.length;
        String mensaje = "";

        System.arraycopy(arreglo1, 0, arreglo2, 0, total);
        for (int i = 0; i < total; i++) {
            mensaje += "[" + arreglo2[i] + "]\n";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Elementos del Arreglo Copiados", 1);
    }
}
