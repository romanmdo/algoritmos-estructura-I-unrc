public class ListaEnlazada <T> implements Lista <T>{
    private Nodo <T> comienzo;
    private int cantidad;
    
    public boolean isEmpty(){
        return (this.cantidad == 0)
    }

    public void eliminarPrimero(){
        if(comienzo != null){
            this.comienzo.setNext(comienzo.getNext());
        }
        this.cantidad--;
    }

    public T buscar(int i){
        if (this.isEmpty()){
            throw new ListaException("Lista Vacia");
        }
        if (i < 0 || i >= this.cantidad){
            throw new ListaException ("Indice fuera de Rango");
        }
        
        Nodo <T> aux = this.comienzo.getNext();
        int k = 0;
        while (aux != null){
            if (k == i) {
                return aux.dato ;
            }
        k++;
        aux = aux.next; // avanza aux
        }
    }

}