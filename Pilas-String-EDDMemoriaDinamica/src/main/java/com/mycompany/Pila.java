package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class Pila {

    String vectorPila[];
    int cima;

    public Pila(int tamanio) {
        vectorPila = new String[tamanio];
        cima = -1;
    }

    public void empujar(String elemento) {
        cima++;
        vectorPila[cima] = elemento;
    }

    public String sacarElemento() {
        String fuera;
        fuera = vectorPila[cima];
        cima--;
        return fuera;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean limpiarPila() {
        if (estaVacia()) {
            return false;
        } else {
            while (!estaVacia()) {
                sacarElemento();
            }
            return true;
        }
    }

    public String mostrarPila() {
        String men = "";
        for (int i = cima; i >= 0; i--) {
            men += "[" + vectorPila[i] + "]\n\t";
        }
        return men;
    }

    public boolean buscarElemento(String elemento) {
        boolean encontrado = false;
        for (int i = cima; i >= 0; i--) {
            if (vectorPila[i].equalsIgnoreCase(elemento)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public boolean estaLlena() {
        return vectorPila.length - 1 == cima;
    }

    public String cimaPila() {
        return vectorPila[cima];
    }

    public int tamanioPila() {
        return vectorPila.length;
    }

}
