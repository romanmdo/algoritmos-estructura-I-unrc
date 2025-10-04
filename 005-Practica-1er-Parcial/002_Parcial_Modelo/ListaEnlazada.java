public class ListaEnlazada <T> implements Lista <T>{
    private Nodo <T> comienzo;
    private int cantidad;
    
    public boolean isEmpty(){
        return (this.cantidad == 0)
    }

    public void eliminarUltimo() {
        if (this.isEmpty()) {
            throw new ListaException("Lista vacía");
        }

        Nodo<T> aux = this.comienzo;
        Nodo<T> previo = null;

        while ( _____________________________ ) {
            previo = aux;
            aux = aux.next;
        }

        if (previo == null) {
            // solo había un nodo
            this.comienzo = null;
        } else {
            previo.next = ___________________________;
        }

        this.cantidad--;
    }

    public int contar(T dato) {
        int contador = 0;
        Nodo<T> aux = ___________________________;

        while ( _____________________________ ) {
            if ( _____________________________ ) {
                contador++;
            }
            aux = ___________________________;
        }

        return contador;
    }
}