public class ListaEnlazada<T> implements Lista<T> {
    private Nodo<T> nodoCabeza;

    @Override
    public void insertarFin(T elem){
        Nodo<T> nodoNuevo = new Nodo<T>(elem);
        Nodo<T> punteroAuxiliar = nodoCabeza;
        
        if(nodoCabeza == null){
            nodoCabeza = nodoNuevo;
            return;
        }
        
        while (punteroAuxiliar.siguiente != null) {
            punteroAuxiliar = punteroAuxiliar.siguiente;
        }

        punteroAuxiliar = nodoNuevo;
    }

    @Override
    public void insertarInicio(T elem){
        Nodo<T> nodoNuevo = new Nodo<T>(elem);
        nodoNuevo.siguiente = nodoCabeza;
        nodoCabeza = nodoNuevo; 
    }

    @Override
    public void insertarPos(T elem, int pos){  // Arreglar este metodo vegano
        Nodo<T> nodoNuevo = new Nodo<T>(elem);
        Nodo<T> nodoAuxiliar = nodoCabeza;

        nodoNuevo.siguiente = nodoAuxiliar.siguiente;
        nodoAuxiliar.siguiente = nodoNuevo;
    }

    @Override
    public T eliminarUltimo() {
        if (nodoCabeza == null) {
            return null; // lista vacía
        }

        if (nodoCabeza.siguiente == null) {
            // Solo hay un nodo
            T dato = nodoCabeza.dato;
            nodoCabeza = null; // la lista queda vacía
            return dato;
        }

        Nodo<T> nodoAuxiliar = nodoCabeza;
        while (nodoAuxiliar.siguiente.siguiente != null) {
            nodoAuxiliar = nodoAuxiliar.siguiente;
        }

        // nodoAuxiliar es ahora el penúltimo nodo
        T dato = nodoAuxiliar.siguiente.dato;
        nodoAuxiliar.siguiente = null; // eliminamos el último
        return dato;
    }

    @Override
    public T eliminarPrimero(){
        Nodo<T> nodoAuxiliar;
        nodoAuxiliar = nodoCabeza;
        nodoCabeza = nodoCabeza.siguiente;
        
        return nodoAuxiliar.dato;
    }

    @Override
    public T getPrimero(){
        Nodo<T> nodoAuxiliar;
        nodoAuxiliar = nodoCabeza;

        return nodoAuxiliar.dato;
    }

    @Override
    public T getUltimo(){
        Nodo<T> nodoAuxiliar;
        nodoAuxiliar = nodoCabeza;

        while (nodoAuxiliar.siguiente != null) {
            nodoAuxiliar = nodoAuxiliar.siguiente;
        }
        
        return nodoAuxiliar.dato;
    }

    @Override
    public int longitud(){
        Nodo<T> nodoAuxiliar;
        nodoAuxiliar = nodoCabeza;
        int contador = 0;

        while (nodoAuxiliar.siguiente != null) {
            nodoAuxiliar = nodoAuxiliar.siguiente;
            contador += 1;
        }
        
        return contador;
    }

    @Override
    public boolean esVacia(){
        if(nodoCabeza == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void getLista() {
        Nodo<T> nodoAuxiliar = nodoCabeza;

        while (nodoAuxiliar != null) {
            String siguiente = (nodoAuxiliar.siguiente != null) ? nodoAuxiliar.siguiente.dato.toString() : "null";
            System.out.println("Nodo: " + nodoAuxiliar.dato + " | Siguiente nodo: " + siguiente);

            nodoAuxiliar = nodoAuxiliar.siguiente; 
        }
    }
}