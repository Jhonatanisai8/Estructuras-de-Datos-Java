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
                        "2. Salir\n", "menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {

                    //opcion de agregar
                    case 1:
                        // peticion de datos
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN ELEMENTOn (int)",
                                "INGRESANDO DATOS AL ARBOL...", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "INGRESE UN ELEMENTO (String)",
                                "INGRESANDO DATOS AL ARBOL...", JOptionPane.INFORMATION_MESSAGE);
                        arbolBinario.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "GRACIAS POR PARTICIPAR");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor ingrese una opcion valida");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR EN: " + e.toString());
            }
        } while (opcion != 2);
    }
}
