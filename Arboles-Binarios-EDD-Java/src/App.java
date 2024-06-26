import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ARBOLES BINARIOS EN JAVA");
        int opcion = 0;
        int elemento;
        String nombre;

        // objeto de la clase arbol
        ArbolBinario arbolBinario = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un Nodo \n" +
                        "2. Recorrer en In-Orden\n" +
                        "3. Recorrer en Pre-Orden\n" +
                        "4. Recorrer en Post-Orden\n" +
                        "5. Salir\n", "menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {

                    // opcion de agregar
                    case 1:
                        // peticion de datos
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN ELEMENTOn (int)",
                                "INGRESANDO DATOS AL ARBOL...", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "INGRESE UN ELEMENTO (String)",
                                "INGRESANDO DATOS AL ARBOL...", JOptionPane.INFORMATION_MESSAGE);
                        arbolBinario.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolBinario.estaVacia()) {
                            System.out.println("Recorrido en In-Orden");
                            arbolBinario.inOrden(arbolBinario.raiz);
                            System.out.println();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 3:
                        if (!arbolBinario.estaVacia()) {
                            System.out.println("Recorrido en Pre-Orden");
                            arbolBinario.preOrden(arbolBinario.raiz);
                            System.out.println();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;

                    case 4:
                        if (!arbolBinario.estaVacia()) {
                            System.out.println("Recorrido en Post-Orden");
                            arbolBinario.postOrden(arbolBinario.raiz);
                            System.out.println();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "GRACIAS POR PARTICIPAR");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor ingrese una opcion valida");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR EN: " + e.toString());
            }

        } while (opcion != 5);
    }
}
