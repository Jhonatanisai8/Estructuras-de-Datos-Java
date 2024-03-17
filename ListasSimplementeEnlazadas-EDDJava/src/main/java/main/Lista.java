package main;

import javax.swing.JOptionPane;

public class Lista {

    //creacion de dos punteros para saber donde esta el inicio y el fin 
    protected Nodo inicio, fin;

    //constructor 
    public Lista() {
        //los punteros apuntan a null
        this.inicio = null;
        this.fin = null;
    }

    //metodo para agregar al inicio 
    public void agregarInicio(int dato) {
        //creando al nodo 
        //validamos que no se repitan numeros
        if (bucarNodo(dato) == true) {
            JOptionPane.showMessageDialog(null, "No se pueden insertar elemento repetidos");
        } else {
            inicio = new Nodo(dato, inicio);

            if (fin == null) {
                fin = inicio;
            }
            JOptionPane.showMessageDialog(null, "Elemento " + dato + " Insertando");
        }
    }

    //metodo para agregar al inicio 
    public void agregarFin(int dato) {
        //validamos que no se repitan numeros
        if (bucarNodo(dato) == true) {
            JOptionPane.showMessageDialog(null, "No se pueden insertar elemento repetidos");
        } else {
            if (!estaVacia()) {
                //creando al nodo 
                fin.siguiente = new Nodo(dato);
                fin = fin.siguiente;
                JOptionPane.showMessageDialog(null, "Elemento " + dato + " Insertando");
            } else {
                inicio = fin = new Nodo(dato);
            }
        }

    }

    //metodo para mostrar los datos 
    public void mostrarLista() {
        if (this.estaVacia() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            String mensaje = "";
            Nodo recorrer = inicio;
            while (recorrer != null) {
                mensaje += "[" + recorrer.dato + "] => ";
                recorrer = recorrer.siguiente;
            }
            JOptionPane.showMessageDialog(null, mensaje, "Mostrando Lista Simplemente Enlazada", 1);
        }
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return this.inicio == null;
    }

    //metodo para borrar Nodo del inicio
    public int borrarInicio() {
        int elememto;
        elememto = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elememto;
    }

    //metodo para sumar Nodos pares
    public int sumarNumeros() {
        int sumaNumeros = 0;
        Nodo recorer = inicio;

        while (recorer != null) {
            sumaNumeros += recorer.dato;
            recorer = recorer.siguiente;
        }
        return sumaNumeros;
    }

    //metodo para conocer la suma de los numeros impares
    public int getsumaImpares() {
        int sumaImpares = 0;
        Nodo recorer = inicio;

        while (recorer != null) {
            if (recorer.dato % 2 != 0) {
                sumaImpares += recorer.dato;
            }
            recorer = recorer.siguiente;
        }
        return sumaImpares;
    }

    //metodo para conocer el promedio de todos los numeros
    public float getPromedioTotal() {
        int suma = this.sumarNumeros();
        int total = this.totalNodos();

        float promedio = suma / total;
        return promedio;
    }

    //mwtodo para conocer la suma de los numeros impares
    public int getSumaPares() {
        int sumaPares = 0;
        Nodo recorre = inicio;

        while (recorre != null) {
            if (recorre.dato % 2 == 0) {
                sumaPares += recorre.dato;
            }

            recorre = recorre.siguiente;
        }

        return sumaPares;
    }

    //promedio de Numeros Pares
    public int getPromedioPares() {
        int sumaPares = 0;
        int contador = 0;
        Nodo recorre = inicio;

        while (recorre != null) {
            if (recorre.dato % 2 == 0) {
                sumaPares += recorre.dato;
                contador++;
            }
            recorre = recorre.siguiente;
        }
        int promedio = sumaPares / contador;
        return promedio;
    }

    //metodo  para concer el promedio de los numeros impares
    public int getPromedioImpares() {
        int sumaImpares = 0;
        int contador = 0;
        Nodo recorre = inicio;

        while (recorre != null) {
            if (recorre.dato % 2 != 0) {
                sumaImpares += recorre.dato;
                contador++;
            }
            recorre = recorre.siguiente;
        }
        int promedio = sumaImpares / contador;
        return promedio;
    }

    //public int Total de Nodos
    public int totalNodos() {
        int contador = 0;
        Nodo recorre = inicio;

        while (recorre != null) {
            contador++;
            recorre = recorre.siguiente;
        }
        return contador;
    }

    //metodo para borrar nodo del Final
    public int borrarFin() {
        int elemento;
        elemento = fin.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    //metodo para borrar un nodo en especifico
    public boolean eliminarNodoEspecifico(int dato) {
        boolean encontrado = false;
        if (!estaVacia()) {
            if (inicio == fin && dato == inicio.dato) {
                inicio = null;
                fin = null;
                encontrado = true;
                //JOptionPane.showMessageDialog(null, "Nodo => " + dato + " ah sido eliminado");
            } else if (dato == inicio.dato) {//minimo tenemos dos 
                inicio = inicio.siguiente;
                encontrado = true;
            } else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != dato) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    //metodo para buscar un nodo
    public boolean bucarNodo(int dato) {
        Nodo temporal;
        temporal = inicio;

        while (temporal != null && temporal.dato != dato) {
            temporal = temporal.siguiente;
        }

        return temporal != null;
    }

    //metodo para borrar toda la lista
    public void borrarLista(Lista lista) {
        while (!estaVacia()) {
            borrarInicio();
        }
        JOptionPane.showMessageDialog(null, "Lista Borrada");
    }

    //metodo para ordernar la lista
    public void ordenar() {
        int t = 1;
        int c = 1;
        Nodo act = inicio;
        while (act.siguiente != null) {
            act = act.siguiente;
            c++;
        }

        /*
        Estas dos variables guardan el valor temporalmente
        
         */
        int tem = 0;
        do {
            act = inicio;
            Nodo sig = act.siguiente;
            while (act.siguiente != null) {
                if (act.dato > sig.dato) {
                    tem = act.dato;

                    act.dato = sig.dato;
                    sig.dato = tem;

                    act = act.siguiente;
                    sig = sig.siguiente;
                } else {
                    act = act.siguiente;
                    sig = sig.siguiente;
                }
            }
        } while (t <= c);
        mostrarLista();
    }

    public void ordenarLista() {
        int aux;
        if (!estaVacia()) {
            if (inicio.siguiente != null) {
                Nodo antp = inicio;
                Nodo p = inicio.siguiente;

                while (p != null) {

                    if (antp.dato > p.dato) {
                        aux = p.dato;
                        p.dato = antp.dato;
                        antp.dato = aux;

                        if (p == inicio.siguiente) {

                            antp = p;
                            p = inicio.siguiente;

                        } else {
                            antp = inicio;
                            p = inicio.siguiente;
                        }
                    } else {
                        antp = p;
                        p = p.siguiente;
                    }
                }
                mostrarLista();
            } else {
                JOptionPane.showMessageDialog(null, "La Lista ya esta  Ordenada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }
    }

    //metodo para encontrar el nodo mayor
    public int nodoMayor() {
        Nodo recorer;
        recorer = inicio;
        int nodoMayor = inicio.dato;

        while (recorer != null) {

            if (recorer.dato > nodoMayor) {
                nodoMayor = recorer.dato;
            }
            recorer = recorer.siguiente;
        }
        return nodoMayor;
    }

    //metodo para encontrar el nodo menor
    public int nodoMenor() {
        Nodo recorer;
        recorer = inicio;
        int nodoMenor = inicio.dato;

        while (recorer != null) {

            if (recorer.dato < nodoMenor) {
                nodoMenor = recorer.dato;
            }
            recorer = recorer.siguiente;
        }
        return nodoMenor;
    }

    //metodo para conocer el ultimo nodo de la lista
    public int ultimoNodo() {
         int primerElemento = fin.dato;
        return primerElemento;
    }

    //metodo para conocer el primer nodo de la lista
    public int primerNodo() {
        int ultimoElemento = inicio.dato;
        return ultimoElemento;
    }

    public void Saber_Primer_Ultimo_Elemento() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista Esta Vacia");
        } else {
            int primerElemento = inicio.dato;
            int ultimoElemento = fin.dato;
            JOptionPane.showMessageDialog(null, "Primer Elemento: " + primerElemento
                    + "\n Ultimo Elemento: " + ultimoElemento);
        }
    }

    //metodo para saber el inicio y inicio de siguiente
    public void inicioSiguiente() {
        if (estaVacia()) {
            System.out.println("La lista esta Vacia");
        } else {
            Nodo recorrer = inicio;
            System.out.println("Inicio => " + inicio.dato);
            while (recorrer != null) {

                int datoSiguiente = inicio.siguiente.dato;
                System.out.println("Inicio de Siguientes => " + datoSiguiente);
                recorrer = recorrer.siguiente;

            }
        }
    }

    //metodo para contar el numero total de numeros negativos ingresados
    public int nodosNegativos() {
        Nodo recorrer;
        recorrer = inicio;
        int contadorNegativos = 0;

        while (recorrer != null) {
            if (recorrer.dato < 0) {
                contadorNegativos++;
            }
            recorrer = recorrer.siguiente;
        }
        this.mostrarLista();
        return contadorNegativos;
    }

    //metodo para contar el numero total de numeros positivos ingresados
    public int nodosPositivos() {
        Nodo recore;
        recore = inicio;
        int contadorPositivos = 0;
        while (recore != null) {
            if (recore.dato > 0) {
                contadorPositivos++;
            }
            recore = recore.siguiente;
        }
        return contadorPositivos;
    }

    //metodo para saber el numero total de ceros en la lista
    public int totalCeros() {
        Nodo recore;
        recore = inicio;
        int contadorCeros = 0;
        while (recore != null) {
            if (recore.dato == 0) {
                contadorCeros++;
            }
            recore = recore.siguiente;
        }
        return contadorCeros;
    }

}
