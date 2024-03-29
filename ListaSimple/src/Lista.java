public class Lista {
    protected Nodo inicio, fin; //punteros para saber donde está el inicio y fin

    public Lista () {
        inicio = null;
        fin = null;
    }

    //Método para saber si la lista está vacía
    public boolean estaVacia () {
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
    }

    //Método para agregar al inicio de la lista
    public void agregarAlInicio (int valor) {
        inicio = new Nodo(valor, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //Método para agregar al final de la lista
    public void agregarAlFinal (int valor) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(valor);
            fin = fin.siguiente;
        }else{
            inicio = fin = new Nodo(valor);
        }
    }

    //Método para mostrar los datos
    public void mostrarLista () {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer!= null) {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }

    //Método para eliminar al inicio
    public void eliminarAlInicio () {
        int valorNodo = inicio.dato; //valorNodo funciona como un backup del nodo
        if (inicio == fin) {
            inicio = null;
            fin = null;
        }else{
            inicio = inicio.siguiente;
        }
        //return valorNodo;
    }

    //Método para eliminar al final
    public int eliminarAlFinal () { //Se usa int para retornar el valorNodo y mostrarlo (Opcional)
        int valorNodo = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return valorNodo;
    }

}
