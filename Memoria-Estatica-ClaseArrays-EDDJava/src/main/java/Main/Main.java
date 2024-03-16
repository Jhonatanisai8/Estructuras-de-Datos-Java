package Main;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        arreglo(arreglo);
        mostrarArreglo(arreglo);
        ordenarArreglo(arreglo);
        inventirArreglo(arreglo);

    }

    public static void arreglo(int arreglo[]) {

        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i)
                    + " Ingresa un numero => "));
        }
    }

    public static void mostrarArreglo(int arreglo[]) {
        int total = arreglo.length;
        String mensaje = "";
        for (int i = 0; i < total; i++) {
            mensaje += "[" + arreglo[i] + "]=";
        }

        JOptionPane.showMessageDialog(null, mensaje, "Mostrando arreglo", 1);
    }

    public static void ordenarArreglo(int arreglo[]) {
        Arrays.sort(arreglo);
        int total = arreglo.length;
        String mensaje = "";
        for (int i = 0; i < total; i++) {
            mensaje += "\t[" + arreglo[i] + "]\n";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Arreglo Ordenado", 2);
    }

    public static void inventirArreglo(int arreglo[]) {

        Arrays.sort(arreglo);
        int total = arreglo.length;
        String mensaje = "";
        for (int i = total - 1; i >= 0; i--) {
            mensaje += "\t[" + arreglo[i] + "]\n";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Monstrando Arreglo en forma descentes ", 1);

    }

}
