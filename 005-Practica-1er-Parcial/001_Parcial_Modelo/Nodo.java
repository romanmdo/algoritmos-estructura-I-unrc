public class Nodo <T>{
    private T info;
    private Nodo <T> next;

    public Nodo<T> getNext(){
        return this.next;
    }

    public void setNext(Nodo<T> next){
        this.next = next;
    }

}